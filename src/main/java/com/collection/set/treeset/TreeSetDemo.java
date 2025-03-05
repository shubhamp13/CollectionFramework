package com.collection.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args) {

        Comparator<Student>c1=(s1,s2)->s1.getId()-s2.getId();
        TreeSet<Student> set=new TreeSet<>(c1);
        set.add(new Student(210,"Shubham Chaudhari"));
        set.add(new Student(210,"Shubham Chaudhari"));
        set.add(new Student(252,"Shubham Puri"));
        set.add(new Student(252,"Shubham Puri"));
        set.add(new Student(362,"Shrikant Surve"));
        set.add(new Student(362,"Shrikant Surve"));
        set.add(new Student(101,"Sejal Patankar"));
        set.add(new Student(101,"Sejal Patankar"));
        set.forEach((s)->System.out.println(s));


    }
}
