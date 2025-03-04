package com.enumpack;

public class AdvanceSwitch
{
    public static void main(String ...args)
    {
        int choice=1;
        String result=switch(choice){
            case 1,2,3,4,5->"WeekDay Working";
            case 6,7->"Weekend No Working";
            default->"Invalid Day";
        };
        System.out.println(result);
    }
}
