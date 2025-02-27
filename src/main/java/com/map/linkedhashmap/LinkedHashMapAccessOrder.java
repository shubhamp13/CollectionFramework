package com.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAccessOrder
{
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>map=new LinkedHashMap<>(10,0.75f,true);

        map.put(10,"Shubham Puri");
        map.put(11,"Shubham Chaudhari");
        map.put(12,"Shrikant Surve");
        map.put(13,"Sejal");
        System.out.println(map);
        map.put(10,"Shubham Pandit Puri");

        //most recentlu used entry will be placed at the end of the LinkedHashMap as accessFactor=true
        for(Map.Entry<Integer,String>entry:map.entrySet())
        {
            System.out.println("Id:"+entry.getKey()+" Name:"+entry.getValue());
        }
        System.out.println(map);

    }
}
