package com.collection.list.copyonwritearrayist;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyOnWriteArrayListThread
{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Integer>copyOnWriteArrayList=new CopyOnWriteArrayList<>();
        CompletableFuture<?>write=CompletableFuture.runAsync(()->{
            for(int i=0;i<=20;i++){
                copyOnWriteArrayList.add(i);
            }
        },executorService);
        write.join();

        CompletableFuture<?>read=CompletableFuture.runAsync(()->{
            for(Integer i:copyOnWriteArrayList){
                try {

                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                System.out.println("Reading:"+i);
            }
        },executorService);
        CompletableFuture<?>update=CompletableFuture.runAsync(()->{
            for(Integer x:copyOnWriteArrayList){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                if(x%2==0){
                    System.out.println("Writing:"+x);
                    copyOnWriteArrayList.remove(x);
                }
            }
        },executorService);
        update.join();
        read.join();
        executorService.shutdown();
        System.out.println(copyOnWriteArrayList);

    }
}
