package com.collection.set.concurrent;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentSet {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer>set1=new CopyOnWriteArraySet<>();
        for(int i=0;i<10;i++){
            set1.add(i);
        }
        for(int i:set1)
        {
            System.out.println(i);
            set1.add(10);
        }
        set1.forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
        ConcurrentSkipListSet<Integer>set2=new ConcurrentSkipListSet<>();
        for(int i=0;i<10;i++){
            set2.add(i);
        }
        for(int i:set2)
        {
            System.out.println(i);
            set2.add(10);
//            if(i==9)
//                set2.add(10);

        }
    }
}
