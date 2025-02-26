package com.collection.list.copyonwritearrayist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo
{
    public static void main(String[] args) {

        /*

        In  this scenario we will get ConcurrentModificationException as while reading the arraylist we are trying to perform update operation because of that we are getting Exception
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<20;i++)
        {
            list.add(i);
        }
        for(int x:list)
        {
            if(x%2==0)
                list.add(0);//we cant perform remove operation also
        }

        */

        //to avoid ConcurrentModificationException we can use CopyOnWriteArrayList

        List<Integer>list=new CopyOnWriteArrayList<>();
        for(int i=0;i<20;i++)
        {
            list.add(i);
        }
        //Whenever you use int x then remove(index) method will be called and whenever your are passing Integer Wrapper class then remove(value) method will be called
        for(Integer x:list)
        {
            if (x%2==0)
                list.remove(x);
            System.out.println(x);
        }
        System.out.println(list);
    }
}
