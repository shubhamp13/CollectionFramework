package com.map.concurrentmap;

import java.util.Map;

import java.util.concurrent.CompletableFuture;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipMapListDemo
{
    public static void main(String[] args) {
        Map<Integer,String> map=new ConcurrentSkipListMap<>();
        CompletableFuture<?>future=CompletableFuture.runAsync(()->{
            add(map,1,1500);
        });
        CompletableFuture<?>future2=CompletableFuture.runAsync(()->{
            add(map,1500,2500);
        });
        future.join();
        future2.join();
        map.forEach((key,value)-> System.out.println(key+":"+value  ));
        System.out.println(map.size());
    }
    public static  void add(Map<Integer,String> map,int start,int end)
    {
        for (int i=end;i>=start;i--)
        {
            map.put(i,""+i);
        }
    }
}
