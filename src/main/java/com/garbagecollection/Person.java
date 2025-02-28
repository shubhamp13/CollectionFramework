package com.garbagecollection;

public class Person
{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize Method is called by JVM For Object:"+this);
    }

    @Override
    public String toString() {
        return "Name:"+this.name+" Age:"+this.age;
    }
}
