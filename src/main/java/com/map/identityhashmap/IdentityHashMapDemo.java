package com.map.identityhashmap;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo
{
    public static void main(String[] args) {
        IdentityHashMap<String,Integer>map=new IdentityHashMap<>();
        map.put(new String("Shubham"),252);
        map.put(new String("Shubham"),210);
//        //the memory addresses of new String("Shu
//        System.out.println(map);
//        IdentityHashMap<Integer ,String>map1=new IdentityHashMap<>();
//        map1.put(10,"Shubham");
//        map1.put(10,"Shubham");
//        Integer i1=128;
//        Integer i2=128;
//        System.out.println(i1==i2);
//        System.out.println(map1);
        System.out.println("--------------------------------------------");
        String s1="Shubham";
        String s2="Shubham";
        System.out.println(" s1==s2:  "+(s1==s2));
        System.out.println("Hashcode using Object class hashCode() of S1:(Based On Reference)"+System.identityHashCode(s1));
        System.out.println("Hashcode using Object class hashCode() of S2(Based On Reference):"+System.identityHashCode(s2));
        System.out.println("Hashcode Using String class hashCode() of S1(Based On Content):"+s1.hashCode());
        System.out.println("Hashcode Using String class hashCode() of S2(Based On Content):"+s2.hashCode());
        System.out.println("--------------------------------------------");


        String s3=new String("Shubham");
        String s4=new String("Shubham");
        System.out.println("{s3==s4}"+(s3==s4));
        System.out.println("Hashcode Using Object class hashCode() of S3(Based on Reference):"+System.identityHashCode(s3));
        System.out.println("Hashcode Using Object class hashCode() of S4(Based On Reference):"+System.identityHashCode(s4));
        System.out.println("Hashcode Using String class hashCode() of S3(Based On Content):"+s3.hashCode());
        System.out.println("Hashcode Using String class hashCode() of S4(Based On Content):"+s4.hashCode());
        System.out.println("--------------------------------------------");



    }
}
