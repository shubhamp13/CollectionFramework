package com.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo
{


    public static void main(String[] args)
    {
        LinkedHashMap<Integer,String>map=new LinkedHashMap<>();
        map.put(252,"Shubham Pandit Puri");
        map.put(210,"Shubham Chaudhari");
        map.put(362,"Shrikant Surve");
        map.put(110,"Sejal Patanakr");
        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        for(Map.Entry<Integer,String>entry:entries)
        {
            System.out.println("RollNo:"+entry.getKey()+" Name:"+entry.getValue());
        }
    }
}
