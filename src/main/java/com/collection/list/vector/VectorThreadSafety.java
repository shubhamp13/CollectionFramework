package com.collection.list.vector;

import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VectorThreadSafety
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newScheduledThreadPool(10);
        Vector<Integer> list = new Vector<>();
        executorService.submit(()->{
            for(int i=0;i<1000;i++)
            {
                list.add(i);
            }
        });
       Future<?>future= executorService.submit(()->{
            for(int i=0;i<1000;i++)
            {
                list.add(i);
            }
        });
       future.get();
        System.out.println(list.size());
        executorService.shutdown();

    }
}
