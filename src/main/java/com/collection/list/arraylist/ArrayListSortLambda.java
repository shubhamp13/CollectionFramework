package com.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSortLambda
{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,9,0,-1,18,23,2013,1,-4,123,222);
        list.sort((a,b)->b-a);
        System.out.println(list);
    }
}
