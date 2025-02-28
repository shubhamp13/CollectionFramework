package com.map.weakhashmap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        int key=10;
        int hashCode = System.identityHashCode(Integer.valueOf(key));
        System.out.println(hashCode);
        WeakHashMap<Student,String>weakHashMap=new WeakHashMap<>();
        Student s1=new Student(101,"Shubham Puri");
        Student s2=new Student(102,"Shubham Chaudhari");
        weakHashMap.put(s1,"MCA");
        weakHashMap.put(s2,"MCA");
        s1=null;
        Runtime.getRuntime().gc();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println(s1);
        System.out.println(weakHashMap);
    }

}
