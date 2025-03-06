package com.collection.queue.dequeue;

import java.util.ArrayDeque;

public class ArrayDequeDemo
{
    public static void main(String[] args) {
        ArrayDeque<Integer>deque=new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(30);
        System.out.println(deque);
    }
}
