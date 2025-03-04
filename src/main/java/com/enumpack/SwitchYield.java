package com.enumpack;

public class SwitchYield {
    public static void main(String[] args) {
        int choice=1;
        String result=switch (choice)
        {
            case 1->{
                System.out.println("Working for case 1");
                yield "One";
            }
            case 2->{
                System.out.println("Working for case 2");
                yield "Two";
            }
            default -> {
                System.out.println("Working for Default Case");
                yield "Default";
            }
        };
        System.out.println(result);
    }
}
