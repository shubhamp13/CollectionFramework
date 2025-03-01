package com.map.sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo
{
    public static void main(String[] args) {
        SortedMap<Integer,String>map=new TreeMap<Integer,String>();
        map.put(252,"Shubham Puri");
        map.put(210,"Shubham Chaudhari");
        map.put(121,"Sejal Patankar");
        map.put(362,"Shrikant Navnath Surve");
        map.forEach((k,v)-> System.out.println(k+":"+v));

        //sortedmap methods

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(252));
        System.out.println(map.tailMap(210));
        System.out.println(map.subMap(210,362));

    }
}
