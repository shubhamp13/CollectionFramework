package com.map.concurrentmap;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleCAS
{
    public static void main(String[] args) {
        AtomicInteger count=new AtomicInteger(0);
        boolean flag1 = count.compareAndSet(0, 1);
        System.out.println("First Update:"+flag1+" Value:"+count.get());
        boolean flag2 = count.compareAndSet(0, 2);
        System.out.println("Second Update:"+flag2+" Value:"+count.get());
        boolean flag3 = count.compareAndSet(1, 3);
        System.out.println("Third Update:"+flag3+" Value:"+count.get());
        System.out.println(count);
    }
}
