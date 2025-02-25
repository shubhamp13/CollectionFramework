package com.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreation
{
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>(15);
        List<Integer>list3=List.of(1,8,3,1,9,9,8);
        Integer []arr=new Integer[15];
        for(int i=0;i<13;i++)
        {
            arr[i]=i;
        }
        List<Integer>list4= Arrays.asList(arr);
        System.out.println(list4);
        System.out.println(Arrays.toString(arr));
        arr[13]=13;
        System.out.println(list4);
    }
}
