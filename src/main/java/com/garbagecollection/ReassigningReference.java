package com.garbagecollection;

public class ReassigningReference
{
    public static void main(String[] args) {
        Person person1 = new Person("Shubham Puri",28);
        Person person2 = new Person("Shubham",26);
        person1=person2;
//        Runtime.getRuntime().gc();
        System.gc();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println(person1);
    }
}
