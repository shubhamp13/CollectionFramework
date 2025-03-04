package com.map.immutablemap;


import com.enumpack.Day;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo
{
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");

        Map<Integer,String>map1= Collections.unmodifiableMap(map);
        System.out.println(map1);

        Map<Integer,String>map2=Map.of(1,"One",2,"Two",3,"Three",4,"Four",5,"Five");
        System.out.println(map2);

        Map<Integer,String>map3=Map.ofEntries(Map.entry(1,"One"),Map.entry(2,"Two"));
        System.out.println(map3);
    }
}
