package com.map.concurrentmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class ConcurrentHashMapDemo
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Map<String,Integer> map=new ConcurrentHashMap<>();
        ExecutorService service= Executors.newFixedThreadPool(4);
        Future<?> submit1 = service.submit(() -> {
            add(map);
        });
        Future<?> submit = service.submit(() -> {
            add(map);
        });
        submit1.get();
        submit.get();
        service.shutdown();
        System.out.println(map.size());

    }
    public static  void add(Map<String,Integer> map)
    {
        for(int i=0;i<1000;i++)
        {
            map.put(Thread.currentThread().getName()+i,i);
        }
    }
}
