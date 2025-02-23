package com.collection.list.arraylist;

import java.lang.reflect.Field;
import java.util.*;

public class ArrayListDemo
{
    public static void main(String[] args){

        //list creation methods

        //Creates an ArrayList with default initial capacity 10
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(null);
        System.out.println(list1);
        //create an ArrayList with initial capacity 20
        ArrayList<Integer>list2=new ArrayList<>(20);

        //Creates an List which size can not be changed but we can replace elements and null insertion possible
        List<Integer>list3=Arrays.asList(1,2,3,null);
        list3.set(1,10);
        System.out.println(list3);

        //Craetes an immutable list we can not replace element also and we can not add null also
        List<Integer>list4=List.of(4,5,6,7,8,9,10,11,12,13,14,14,16,17,null);
        System.out.println(list4);












/*
ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        List<Integer>l1= Arrays.asList(11,12,13,14,15,16,17,18,19,20);
        List<Integer>l2=List.of(21,22,23,24);
        list.addAll(l1);
        System.out.println(list);
        System.out.println(list.containsAll(l1));
        System.out.println(list.contains(1));
        list.removeAll(l1);
        System.out.println(list);
        list.clear();
  //List iteration

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(int x:list){
            System.out.println(x);
        }
        Iterator<Integer>iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ListIterator<Integer>listIterator=list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //remove by index
        list.remove(1);
        System.out.println(list);

        //remove by object
        list.remove(Integer.valueOf(1));
        System.out.println(list);
        */



    }
}
