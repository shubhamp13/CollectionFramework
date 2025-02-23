package com.collection.list.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCapacity
{
    public static void main(String[] args) throws Exception {

        ArrayList<Integer>list=new ArrayList<>();
        Field f1=ArrayList.class.getDeclaredField("elementData");
        f1.setAccessible(true);
        Object []o1=(Object[]) f1.get(list);
        System.out.println("Internal Array capacity: "+o1.length);

        list.add(1);
        System.out.println("After adding an element to list");
        Field f2=ArrayList.class.getDeclaredField("elementData");
        f2.setAccessible(true);
        Object []o2=(Object[]) f2.get(list);
        System.out.println("Internal Array capacity: "+o2.length);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println("After adding 11 element to list the size of an internal array");

        Field f3=ArrayList.class.getDeclaredField("elementData");
        f3.setAccessible(true);
        Object []o3=(Object[]) f3.get(list);
        System.out.println("Internal Array capacity: "+o3.length);
    }
}
