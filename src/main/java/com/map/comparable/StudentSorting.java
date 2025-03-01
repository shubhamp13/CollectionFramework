package com.map.comparable;

import java.util.*;

public class StudentSorting
{
    public static void main(String[] args) {
        Student s1=new Student(252,"Shubham Puri",26,87);
        Student s2=new Student(210,"Shubham Chaudhari",22,80);
        Student s3=new Student(362,"Shrikant Surve",21,67);
        Student s4=new Student(152,"Sejal Patankar",21,81);
        List<Student>students= Arrays.asList(s1,s2,s3,s4);
        Collections.sort(students);
       for(Student student:students)
           System.out.println(student);


    }
}
