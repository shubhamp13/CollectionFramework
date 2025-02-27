package com.map.hashmap;

import java.util.HashMap;

public class DefaultMethods
{
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(252,"Shubham");
        map.put(210,"Shubham");
        map.put(362,"Shrikant");
        System.out.println(map.putIfAbsent(252,"Shubham Pandit Puri"));
        System.out.println(map);
        map.computeIfAbsent(1234,(k)->random(k));
        map.computeIfAbsent(1211,DefaultMethods::random);
        map.forEach((k,v)->System.out.println("Roll No:"+k+" Name:"+v));

        map.computeIfPresent(252,(key,value)->value.toUpperCase());
        System.out.println(map.get(252));
        String notPresent = map.getOrDefault(2521, "Not Present");
        System.out.println(notPresent);


    }
    public  static  String random(int n)
    {
        return ""+((int)(Math.random()*100)+n);
    }
}
