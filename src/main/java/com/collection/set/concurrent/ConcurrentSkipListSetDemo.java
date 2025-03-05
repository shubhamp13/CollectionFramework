package com.collection.set.concurrent;

import java.util.HashSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentSkipListSet;


public class ConcurrentSkipListSetDemo
{
    public static void main(String[] args) {
//        HashSet<Integer>set=new HashSet<>();

        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(i);
        }

        CompletableFuture<?>readerThread=CompletableFuture.runAsync(()->{
            Thread.currentThread().setName("Reader Thread");
            for(int i:set)
            {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        });
        CompletableFuture<?>writerThread=CompletableFuture.runAsync(()->{
            Thread.currentThread().setName("Writer Thread");
            System.out.println("Adding new element by:"+Thread.currentThread().getName());
            set.add(11);
            System.out.println("Removing element by:"+Thread.currentThread().getName());
            set.remove(10);
        });
        readerThread.join();
        writerThread.join();
        set.forEach(System.out::println);

    }
}
