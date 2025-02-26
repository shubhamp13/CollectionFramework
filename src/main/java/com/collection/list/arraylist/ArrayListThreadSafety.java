package com.collection.list.arraylist;

import java.util.ArrayList;
import java.util.concurrent.*;

public class ArrayListThreadSafety
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service=Executors.newFixedThreadPool(10);
        ArrayList<Integer>list=new ArrayList<>();
        CompletableFuture<?>future=CompletableFuture.runAsync(()->{
            for(int i=0;i<1000;i++)
            {
                list.add(i);
            }
        });
        CompletableFuture<?>future2=CompletableFuture.runAsync(()->{
            for (int i=0;i<1000;i++)
            {
                list.add(i);
            }
        });
        future.join();
        future2.join();
        System.out.println(list.size());
    }
}
