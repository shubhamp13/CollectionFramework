package com.map.concurrentskiplistmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.*;

public class ConcurrentSkipListMapDemo
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Map<Integer,String>map=new ConcurrentSkipListMap<>();
        ExecutorService service= Executors.newFixedThreadPool(10);
        service.submit(()->{
            map.put(1,"1");
            map.put(2,"2");
            map.put(3,"3");
            System.out.println("1,2,3 added by thread"+Thread.currentThread().getName());
        });
        service.submit(()->{
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            map.put(4,"4");
            map.put(5,"5");
            map.put(6,"6");
            System.out.println("4,5,6 added by thread"+Thread.currentThread().getName());
        });
        map.forEach((key,value)->{
            System.out.println(key+":"+value);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });
        service.shutdown();

    }
}
