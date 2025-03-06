package com.collection.queue.blockingqueue;

import java.util.ArrayDeque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ProducerThread implements Runnable {
    private BlockingQueue<Integer> queue;
    private  int data;

    public ProducerThread(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Produced:"+data);
                queue.put(data++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
class ConsumerThread implements Runnable {
    private BlockingQueue<Integer> queue;
    public ConsumerThread(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer i=queue.take();
                System.out.println("Consumed:"+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class BlockingQueueDemo
{
    public static void main(String[] args) {
        BlockingQueue<Integer>queue = new ArrayBlockingQueue<>(1);
        ProducerThread producerThread = new ProducerThread(queue);
        ConsumerThread consumerThread = new ConsumerThread(queue);
        Thread producerThread1 = new Thread(producerThread);
        Thread consumerThread1 = new Thread(consumerThread);
        producerThread1.start();
        consumerThread1.start();
        
    }
}
