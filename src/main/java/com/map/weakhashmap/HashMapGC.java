package com.map.weakhashmap;

import java.util.HashMap;

public class HashMapGC
{
    public static void main(String[] args) {
        Student s1=new Student(101,"Shubham Puri");
        Student s2=new Student(102,"Shubham Chaudhari");

        HashMap<Student,String>map=new HashMap<>();
        map.put(s1,"MCA-252");
        map.put(s2,"MCA-210");
        s1=null;
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(map);
        System.out.println(s1);
    }
}
