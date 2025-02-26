package com.collection.list.vector;

import java.util.List;
import java.util.Vector;

public class VectorCapacity
{
    public static void main(String[] args) {
        //creates a vector with initial capacity 10 by default.Once vector reaches its capacity then its capacity will be doubled
        Vector <Integer>vector=new Vector();
        System.out.println("Vector Capacity:"+vector.capacity());
        vector.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Vector Capacity after 10 elements inserting:"+vector.capacity());
        vector.add(11);
        System.out.println("Vector capacity after 11 th element insertion:"+vector.capacity());

        System.out.println("Creating Vector with given initial capacity");
        Vector <Integer>vector1=new Vector<>(25);
        System.out.println("Vector1 Capacity:"+vector1.capacity());

        Vector <Integer>vector2=new Vector<>(5,3);
        System.out.println("this will create an vector with initial capacity of 5 elements and once vector capacity is full then it will increase by 3");
        System.out.println("Once 5 elements are filled at the time of 6 th insertion new capacity of vector will be 8");
        vector2.addAll(List.of(1,2,3,4,5));
        System.out.println("Capacity till 55 elements:"+vector2.capacity());
        vector2.add(6);
        System.out.println("Capacity after 6 elements:"+vector2.capacity());
    }
}
