package com.collection.set.hashset;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) throws Exception {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("HashSet: " + set); // Print set

        // Using reflection to access the internal HashMap
        Field mapField = HashSet.class.getDeclaredField("map");
        mapField.setAccessible(true); // Allow access to private field

        // Get the actual HashMap inside HashSet
        HashMap<?, ?> internalMap = (HashMap<?, ?>) mapField.get(set);

        System.out.println("Internal HashMap: " + internalMap);
        internalMap.forEach((key,value)-> System.out.println(key+":"+value.hashCode()));
    }
}
