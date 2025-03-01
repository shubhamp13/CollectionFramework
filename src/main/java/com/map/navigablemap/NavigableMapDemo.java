package com.map.navigablemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo
{
    public static void main(String[] args) {
        NavigableMap<Integer,String>map=new TreeMap<>();

        map.put(101,"Shubham Chaudhari");
        map.put(1,"Rutunagari");
        map.put(3,"Hadapsar");
        map.put(4,"Narhe");
        map.put(10,"Hadapsar");
        map.put(6,"Rutunagari");

//        map.forEach((k,v)-> System.out.println(k+" "+v));


        //NavigableMap methods

        System.out.println(map.lowerKey(10));//6
        System.out.println(map.higherKey(1));//3
        System.out.println(map.ceilingKey(4));//4 next key which is greater than or equal to given key
        System.out.println(map.floorKey(7));//6 greatest key less than or equal to given key

        Thread.currentThread().yield();
        System.out.println(map.ceilingEntry(5));//{6=Rutunagaro}
        System.out.println(map.floorEntry(11));//{10=Hadapsar}

        System.out.println(map.descendingMap());
        System.out.println(map.descendingKeySet());
        System.out.println(map.pollFirstEntry());//first entry will be removed and returned
        System.out.println(map.pollLastEntry());//last entry will be removed and returned
        map.forEach((k,v)-> System.out.println(k+"  "+v));
    }
}
