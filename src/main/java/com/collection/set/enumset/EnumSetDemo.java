package com.collection.set.enumset;

import java.util.EnumSet;

public class EnumSetDemo
{
    public static void main(String[] args) {
        EnumSet<Day>set1=EnumSet.of(Day.MONDAY,Day.SUNDAY);//Creates an EnumSet of Monday and Sunday
        set1.forEach(System.out::println);
        System.out.println("----------------------------------------------------");

        EnumSet<Day>set2=EnumSet.allOf(Day.class);//Creates an EnumSet of all Values of Day
        set2.forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        EnumSet<Day>set3=EnumSet.noneOf(Day.class);//Creates an Empty EnumSet
        System.out.println(set3.size());
        System.out.println("----------------------------------------------------");


        EnumSet<Day>set4=EnumSet.range(Day.MONDAY,Day.FRIDAY);
        set4.forEach(System.out::println);
    }
}
