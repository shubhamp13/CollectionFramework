package com.map.weakhashmap;

public class IndexInMap
{
    public static void main(String[] args) {
        String name="Shubham Puri";
        int hashCode=System.identityHashCode(name);
        System.out.println(hashCode);
        String name2="Shubham Puri";
        int hashCode2=System.identityHashCode(name2);
        System.out.println(hashCode2);
    }
}
