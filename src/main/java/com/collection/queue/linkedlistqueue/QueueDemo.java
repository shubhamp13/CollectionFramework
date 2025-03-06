package com.collection.queue.linkedlistqueue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueDemo
{
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        boolean add = queue.add(1);
        System.out.println(add);
        boolean offer= queue.offer(2);//It will not throw exception if queue is full rather it will return false
        System.out.println(offer);

        Integer i=queue.remove();//It will throw NoSuchElementException if Queue is empty
        System.out.println("Removed:"+i);
        queue.remove();
        Integer i2=queue.poll();//It will not throw exception it return Null
        System.out.println(i2);


        queue.offer(1);
        queue.offer(3);
        Integer i4=queue.element();//This will throw an Exception if Queue is empty NoSuchElementException
        System.out.println("Head Element:"+i4);
        Integer i3=queue.peek();
        System.out.println("Peeked Element:"+i3);
        queue.clear();
        try {
            queue.element();
        }catch (NoSuchElementException e)
        {
            System.out.println("Element Not Found");
        }
        System.out.println(queue.peek());// This will return null if queue is empty but it will not throw any exception
    }
}
