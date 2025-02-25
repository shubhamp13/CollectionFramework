package com.collection.list.arraylist;

import java.util.*;

public class ArrayListMethods
{
    private static ArrayList<String> list;
    public  boolean  add(String data)
    {
        System.out.println("user");
        return list.add(data);
    }
    public boolean addAll(Collection<String> data)
    {
        System.out.println("user");

        return list.addAll(data);
    }
    public void add(int index, String data)
    {
        System.out.println("user");

        list.add(index, data);
    }
    public void remove(int index)
    {
        System.out.println("user");

        list.remove(index);
    }
    public boolean remove(String data)
    {
        System.out.println("user");

        return list.remove(data);
    }
    public  boolean removeAll(Collection<String> data)
    {
        System.out.println("user");

        return list.removeAll(data);
    }
    public  int size()
    {
        System.out.println("user");

        return list.size();
    }
    public  boolean isEmpty()
    {
        System.out.println("user");

        return list.isEmpty();
    }
    public boolean retainAll(Collection<String>data)
    {
        System.out.println("user");

        return list.retainAll(data);
    }
    public Iterator<String>iterator()
    {
        System.out.println("user");

        return list.iterator();
    }
    public String[]toArray(String[]arr)
    {
        System.out.println("user");

        return list.toArray(arr);
    }
    public Object[]toArray()
    {
        System.out.println("user");

        System.out.println("user");

        return list.toArray();
    }
    public ListIterator <String>listIterator()
    {
        return list.listIterator();
    }

    public static void main(String[] args) {
        list=new ArrayList<>();
        ArrayListMethods arrayListMethods=new ArrayListMethods();
        arrayListMethods.add("Shubham");
        arrayListMethods.add(1,"Sejal");
        arrayListMethods.addAll(Arrays.asList("Shrikant","Omkar"));




    }
}
