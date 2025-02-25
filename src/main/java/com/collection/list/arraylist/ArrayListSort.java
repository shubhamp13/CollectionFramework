package com.collection.list.arraylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ListComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer i1, Integer i2)
    {
        return i2-i1;
    }
}
public class ArrayListSort
{
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,9,0,-1,18,23,2013,1,-4,123,222);
        System.out.println(list);
        list.sort(new ListComparator());
        System.out.println(list);

    }
}
