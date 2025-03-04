package com.map.enummap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

enum Day
{
    MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumMapDemo
{
    public static void main(String[] args) {

//        Map<Day,String> map=new HashMap<Day,String>();
//        long time=System.currentTimeMillis();
//        map.put(Day.SUNDAY,"No work");
//        map.put(Day.MONDAY,"Walking");
//        map.put(Day.TUESDAY,"Running");
//        map.put(Day.WEDNESDAY,"Climbing");
//        map.put(Day.THURSDAY,"Swimming");
//        map.put(Day.FRIDAY,"Yoga");
//        map.put(Day.SATURDAY,"No Work");
//        long endTime=System.currentTimeMillis();
//        System.out.println(endTime-time);


        Map<Day,String>map1=new EnumMap<Day,String>(Day.class);
        long time1=System.currentTimeMillis();

        map1.put(Day.SUNDAY,"No work");
        map1.put(Day.MONDAY,"Walking");
        map1.put(Day.TUESDAY,"Running");
        map1.put(Day.WEDNESDAY,"Climbing");
        map1.put(Day.THURSDAY,"Swimming");
        map1.put(Day.FRIDAY,"Yoga");
        map1.put(Day.SATURDAY,"No Work");
        long time2=System.currentTimeMillis();
         System.out.println(time2-time1);


    }
}
