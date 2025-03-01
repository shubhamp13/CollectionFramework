package com.map.sortedmap;

import java.util.Objects;

public class Person
{
    private  String name;
    private int age;
    private int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(getClass()==obj.getClass()))
            return false;
        Person person = (Person) obj;
        return this.id==person.getId() && this.name.equals(person.getName());
    }

    @Override
    public String toString() {
        return "Name:"+name+"\nId:"+id+"\nAge:"+age+"--------------------------";
    }
}
