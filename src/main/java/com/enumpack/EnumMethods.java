package com.enumpack;

public class EnumMethods
{
    public static void main(String[] args) {

        Day today=Day.MONDAY;
        System.out.println(today.name());//it will return the value in string
        System.out.println(today.ordinal());//it will return an index of given constant 0-based

        for(Day day:Day.values())
        {
            System.out.println(day.name()+" At Index: "+day.ordinal());
        }
        Day day = Day.valueOf("MONDAY");//it will return an instance of given constant if available else throw exception illegal argument exception
        System.out.println(day.name());

    }
}
