package com.collection.set.concurrent;


import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo
{
    public static void main(String[] args) {
        try {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < 10; i++) {
                set.add(i);
            }
            for(int i:set)
            {
                if(i%2==0)
                    set.remove(i);
            }
        }catch (Exception e) {
            System.out.println("Concurrent Modification Exception");
        }

        CopyOnWriteArraySet<Integer>set1=new CopyOnWriteArraySet<>();
        for(int i=0;i<10;i++)
        {
            set1.add(i);
        }
        for(int i:set1)
        {
            if (i%2==0)
            {
                System.out.println("Removing:"+i);
                set1.remove(i);
            }
        }
    }
}
