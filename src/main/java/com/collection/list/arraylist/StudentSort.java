package com.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSort
{
    public static void main(String[] args) {
        Student student1=new Student("Shubham Puri",26,8.81);
        Student student2=new Student("Shrikant Surve",22,7.52);
        Student student3=new Student("Shubham Chaudhari",22,8.51);
        Student student4=new Student("Sejal Patankar",21,8.81);

        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        System.out.println("Before Sorting");
        System.out.println(list);
        Comparator<Student>comparator=Comparator.comparing(Student::getGpa).thenComparing(Student::getName);
        list.sort(comparator);

//        list.sort((s1,s2)->{
//            Double d1=s1.getGpa();
//            Double d2=s2.getGpa();
//            return d1.compareTo(d2);
//        });
        System.out.println("After Sorting");
        System.out.println(list);

    }
}
