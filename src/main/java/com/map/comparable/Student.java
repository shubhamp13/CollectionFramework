package com.map.comparable;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private  int rollNo;
    private String name;
    private int age;
    private int marks;

    public Student(int rollNo, String name, int age, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,rollNo);
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==this)
            return true;
        if(obj==null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        Student other = (Student) obj;
        return this.rollNo==other.getRollNo() && this.name.equals(other.getName());
    }

    @Override
    public String toString() {
        return "Name:"+name+"\nRoll No:"+rollNo+"\nAge:"+age+"\nMarks:"+marks+"\n----------------------------------------------------------\n";
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(rollNo, student.getRollNo());
    }
}
