package com.map.identityhashmap;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo
{
    public static void main(String[] args) {
        IdentityHashMap<String,Integer>map=new IdentityHashMap<>();
        map.put(new String("Shubham"),252);
        map.put(new String("Shubham"),210);
        //the memory addresses of new String("Shu
        System.out.println(map);
        IdentityHashMap<Integer ,String>map1=new IdentityHashMap<>();
        map1.put(10,"Shubham");
        map1.put(10,"Shubham");
        Integer i1=128;
        Integer i2=128;
        System.out.println(i1==i2);
        System.out.println(map1);

    }
}
