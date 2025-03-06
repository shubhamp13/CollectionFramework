package com.collection.queue.linkedlistqueue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo

{
    LinkedList<Integer>queue=new LinkedList<>();
    public static void main(String[] args) {
        LinkedListQueueDemo linkedListQueueDemo=new LinkedListQueueDemo();
        linkedListQueueDemo.add(10);
        linkedListQueueDemo.add(20);
        linkedListQueueDemo.offer(30);
        linkedListQueueDemo.offer(40);
        linkedListQueueDemo.offer(50);
        linkedListQueueDemo.offer(60);
        linkedListQueueDemo.remove();
        linkedListQueueDemo.poll();
        linkedListQueueDemo.peek();
        linkedListQueueDemo.element();
    }

    public boolean add(int data)
    {
        System.out.println("Adding Element to Queue:"+data);
        System.out.println("--------------------------------------------------------");
        //This will Throw exception IllegalStateException if queue is full
        return queue.add(data);
    }
    public boolean offer(int data)
    {
        System.out.println("Offering Element To Queue:"+data);
        System.out.println("--------------------------------------------------------");

        //This will not throw any exception oif queue is full
        //this will return false if queue is full
        return queue.offer(data);
    }

    public Integer remove()
    {
        System.out.println("Removing and Returning head element:"+queue.remove());
        System.out.println("--------------------------------------------------------");

        //This will throw an exception if queue is empty
        return queue.remove();
    }
    public Integer poll()
    {
        System.out.println("Removing And Returning head element:"+queue.poll());
        System.out.println("--------------------------------------------------------");

        return queue.poll();
    }
    public Integer element()
    {
        System.out.println("Retriving Head Element: using element"+queue.element());
        System.out.println("--------------------------------------------------------");

        //throws an NoSuchElementException if queue is empty
        return queue.element();
    }
    public Integer peek()
    {
        System.out.println("Retriving Head element:using peek"+queue.peek());
        System.out.println("--------------------------------------------------------");

        //return null if queue is empty
        return queue.peek();
    }
}
