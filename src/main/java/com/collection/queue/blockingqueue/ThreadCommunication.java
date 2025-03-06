package com.collection.queue.blockingqueue;

public class ThreadCommunication
{
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        Producer producer=new Producer(resource);
        Consumer consumer=new Consumer(resource);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
class SharedResource
{
    private  int data;
    private boolean isAvailable;

    public SharedResource( ) {
    }
    public synchronized void produce(int data)
    {
        while (isAvailable)
        {
            try {
                wait();
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        isAvailable = true;
        this.data = data;
        System.out.println("Produced: " + data);
        notify();
    }
    public  synchronized  void consume()
    {
        while (!isAvailable)
        {
            try {
                wait();
            }catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
        isAvailable = false;
        System.out.println("Consumed: " + data);
        notify();
    }
}
class  Producer implements Runnable
{
    private SharedResource sharedResource;
    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for(int i=0;i<=10;i++)
        {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedResource.produce(i);
        }
    }
}
class Consumer implements Runnable
{
    private SharedResource sharedResource;
    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i=0;i<=10;i++)
        {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedResource.consume();
        }
    }
}
