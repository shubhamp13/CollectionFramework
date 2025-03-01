package com.map.sortedmap;

import java.util.*;

public class SortedMapPerson
{
    public static void main(String[] args) {
        Person p1=new Person("Shubham",26,101);
        Person p2=new Person("Shrikant",22,201);
        Person p3=new Person("Sejal Patankar",22,11);
        Person p4=new Person("Shubham Chaudhari",24,81);

        SortedMap<Person,String>persons=new TreeMap<Person,String>((a,b)->Integer.compare(a.getId(),b.getId()));
        persons.put(p1,"Dhayari");
        persons.put(p2,"Narhe");
        persons.put(p3,"Rutunagari");
        persons.put(p4,"Hadapsar");
        persons.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
