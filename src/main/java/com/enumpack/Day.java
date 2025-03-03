package com.enumpack;

public enum Day
{
    MONDAY("Working Full Time"),TUESDAY("Working Full Time"),WEDNESDAY("Working Full Time"),THURSDAY("Working Full Time"),FRIDAY("Working Full Time"),SATURDAY("Working Half Day");
    public    final  String working;
    Day(String working)
    {
        this.working = working;
    }
    public  String workingHours()
    {
        return working;
    }

}
