package com.collection.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main(String[] args) {
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        System.out.println(set);
        set.forEach((i)->System.out.println(i));
    }
}
