package com.enumpack;

public class EnumSwitchDemo
{
    public static void main(String[] args) {

        Day today=Day.SATURDAY;
       String res= switch (today) {
            case SATURDAY->"saturday";
           case WEDNESDAY -> "wednesday";
           case THURSDAY -> "Thursday";
           case FRIDAY->"friday";
            case MONDAY->"monday";
            case TUESDAY->"tuesday";
        };
        System.out.println(res);
    }
}
