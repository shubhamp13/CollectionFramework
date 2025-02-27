package com.map.hashmap;

public class HashFunction
{
    public static void main(String[] args) {
        Integer num=252;
        System.out.println(num.hashCode());
        System.out.println(252%16);
        String a="EEE";
        System.out.println(a.hashCode());
    }
}
