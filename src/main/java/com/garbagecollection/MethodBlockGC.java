package com.garbagecollection;

public class MethodBlockGC
{
    public static void m1()
    {
        System.out.println("Inside M1");
        Person person = new Person();
    }

    public static void main(String[] args) {
        m1();
        Runtime.getRuntime().gc();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


    }
}
