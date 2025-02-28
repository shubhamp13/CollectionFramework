package com.garbagecollection;

import java.lang.ref.WeakReference;

public class NulliFyGC
{
    public static void main(String[] args) {
        Person person = new Person();
        person=null;
        Runtime.getRuntime().gc();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

    }
}
