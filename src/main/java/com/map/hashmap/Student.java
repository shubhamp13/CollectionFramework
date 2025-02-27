package com.map.hashmap;

import java.util.Objects;

public class Student
{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if (obj instanceof Student) {
            Student student=(Student) obj;
            return id==student.getId() && name.equals(student.getName());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name:"+name+" ID:"+id;
    }
}
