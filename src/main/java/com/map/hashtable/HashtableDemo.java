package com.map.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class HashtableDemo
{
    static  int cnt=0;
    public static void main(String[] args) {
        Hashtable<Integer,String>hashtable=new Hashtable<>();
//        HashMap<Integer,String> hashtable=new HashMap<>();

        CompletableFuture<?>reading=CompletableFuture.runAsync(()->{
            for(int i=0;i<1000;i++)
            {
                ++cnt;
                Thread.currentThread().setName("Thread-"+i);
                hashtable.put(i,String.valueOf(Thread.currentThread().getName()));
            }
        });

        CompletableFuture <?> writing=CompletableFuture.runAsync(()->{
            for(int i=0;i<1000;i++)
            {
                ++cnt;
                Thread.currentThread().setName("Thread-"+i);
                hashtable.put(i,String.valueOf(Thread.currentThread().getName()));
            }
        });
        reading.join();
        writing.join();
        hashtable.forEach((key,value)->System.out.println(key+"  "+value));
        System.out.println(cnt);
    }
}
