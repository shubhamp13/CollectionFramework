package com.map.hashmap;

import java.util.HashMap;

public class HashMapWithStudent
{
    public static void main(String[] args) {

        HashMap<Student,String>studentHashMap=new HashMap<>();
        Student s1=new Student(252,"Shubham Puri");
        studentHashMap.put(s1,"MCA-B");
        Student s2=new Student(210,"Shubham Chaudhari");
        Student s3=new Student(362,"Shrikant Surve");
        Student s4=new Student(252,"Shubham Puri");
        System.out.println("Hashcode of S1:"+s1.hashCode());
        System.out.println("Hashcode of S4:"+s4.hashCode());
        System.out.println("Equality:(s1,s4):"+s1.equals(s4));
        studentHashMap.put(s2,"MCA-B");
        studentHashMap.put(s3,"MCA-C");
        studentHashMap.put(s4,"MCA-B");
        System.out.println(studentHashMap.size());
        System.out.println(studentHashMap);

    }
}
