package com.map.weakhashmap;

import java.util.Objects;

public class Student
{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
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
    public String toString() {
        return "Name:"+name+" ID:"+id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if(this==null)
            return false;

        if(!(obj instanceof Student))
            return false;
        Student other = (Student)obj;
        return Objects.equals(name,other.name) && id == other.id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize Method is called on object " + this);
    }
}
