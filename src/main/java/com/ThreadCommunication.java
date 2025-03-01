package com;

class SharedResource
{
    private  int  data;
    private  boolean isAvailable;
    public  synchronized  void produce(int data){
        while (isAvailable){
            try {
                wait();
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        isAvailable = true;
        this.data = data;
        System.out.println("Produced:"+data);
        notify();
    }
    public  synchronized  int consume(){
        while (!isAvailable){
            try {
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        isAvailable = false;
        System.out.println("Consume:"+data);
        notify();
        return data;
    }
}
class Producer implements Runnable{
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            sharedResource.produce(i);
        }
    }
}
class Consumer implements Runnable{
    private SharedResource sharedResource;
    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            sharedResource.consume();
        }
    }
}
public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
