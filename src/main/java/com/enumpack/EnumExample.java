package com.enumpack;

public class EnumExample
{
    public static void main(String[] args) {
        Day today=Day.SATURDAY;
        System.out.println(today);
        System.out.println(today.workingHours());
    }
}
