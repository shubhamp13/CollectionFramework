package com.collection.queue.dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueDemo
{
    Deque<Integer>deque=new LinkedList<>();
    public static void main(String[] args)
    {
        DequeueDemo queue=new DequeueDemo();
        queue.addFirst(10);
        queue.offerFirst(20);
        queue.addLast(30);
        queue.offerLast(40);
        queue.addLast(50);
        queue.offerLast(60);
        queue.offerLast(70);
        int i1 = queue.removeFirst();
        System.out.println(i1);
        int i2=queue.removeLast();
        System.out.println(i2);
        int i3=queue.pollFirst();
        System.out.println(i3);
        int i4=queue.pollLast();
        System.out.println(i4);
        int i5=queue.peekFirst();
        int i6=queue.peekLast();
        int i7=queue.getFirst();
        int i8=queue.getLast();

    }
    public  void addFirst(Integer i)
    {
        System.out.println("Element is added in front of the queue:"+i);
         deque.addFirst(i);
    }
    public void addLast(Integer i)
    {
        System.out.println("Element is added in End of the queue:"+i);
        deque.addLast(i);
    }
    public boolean offerFirst(Integer i)
    {
        System.out.println("Element Is added in front of queue if available:"+i);
        return deque.offerFirst(i);
    }
    public boolean offerLast(Integer i)
    {
        System.out.println("Element Is added in rear of queue if available:"+i);
        return deque.offerLast(i);
    }
    public Integer removeFirst()
    {
        System.out.println("Element is removing from the queue form front:");
        return deque.removeFirst();
    }
    public Integer removeLast()
    {
        System.out.println("Element is removing from the queue form rear:");
        return deque.removeLast();
    }
    public Integer pollFirst()
    {
        System.out.println("Element is removing from queue from front if available:");
        return deque.pollFirst();
    }
    public Integer pollLast()
    {
        System.out.println("Element is removing from queue from rear if available:");
        return deque.pollLast();
    }
    public Integer peekFirst()
    {
        System.out.println("Element is retrieving from queue from front if available");
        return deque.peekFirst();
    }
    public Integer peekLast()
    {
        System.out.println("Element is retrieving from queue from rear if available");
        return deque.peekFirst();
    }
    public Integer getFirst()
    {
        System.out.println("Element is retrieving from queue from front");
        return deque.getFirst();
    }
    public Integer getLast()
    {
        System.out.println("Element is retrieving from queue from rear");
        return deque.getFirst();
    }






}
