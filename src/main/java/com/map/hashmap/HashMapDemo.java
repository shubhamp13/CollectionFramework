package com.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{
    private  HashMap<Integer,String>hashmap=new HashMap<>();

    public String put(Integer key, String value)
    {
        return hashmap.put(key,value);
    }
    public String get(Integer key)
    {
        return hashmap.get(key);
    }
    public void clear()
    {
        hashmap.clear();
    }
    public Set<Integer> keySet()
    {
        return hashmap.keySet();
    }
    public Collection<String>values()
    {
        return hashmap.values();
    }
    public Set<Map.Entry<Integer,String>>entrySet()
    {
        return hashmap.entrySet();
    }
    public String replace(Integer key,String value)
    {
        return hashmap.replace(key,value);
    }
    public  boolean replace(Integer key,String oldValue,String newValue)
    {
        return hashmap.replace(key,oldValue,newValue);
    }
    public boolean isEmpty()
    {
        return hashmap.isEmpty();
    }
    public int size()
    {
        return hashmap.size();
    }
    public boolean containsKey(Integer key)
    {
        return hashmap.containsKey(key);
    }
    public boolean containsValue(String value)
    {
        return hashmap.containsValue(value);
    }
    public String remove(Integer key)
    {
        return hashmap.remove(key);
    }
    public void display()
    {
        Set<Map.Entry<Integer,String>>entries=this.entrySet();
        if (entries.isEmpty())
        {
            System.out.println("No Entries");
            return;
        }
        for(Map.Entry<Integer,String>entry:entries)
        {
            System.out.print("Key:"+entry.getKey());
            System.out.println(" Value:"+entry.getValue());
        }
    }
    public String putIfAbsent(Integer key,String value)
    {
        return hashmap.putIfAbsent(key,value);
    }
    public String getOrDefault(Integer key)
    {
        return hashmap.getOrDefault(key,"Not Available");
    }

    public static void main(String[] args)
    {
        HashMapDemo demo=new HashMapDemo();
        demo.put(252,"Shubham Pandit Puri");
        demo.put(210,"Shubham Balu Chaudhari");
        demo.put(362,"Shrikant Navnath Surve");
        demo.display();
        System.out.println(demo.isEmpty());
        System.out.println(demo.size());
        System.out.println("Removed Value:"+demo.remove(362));
        System.out.println("Replace:"+demo.replace(252,"Shubham"));
        demo.display();
        System.out.println("Replace:"+demo.replace(252,"Shubham","Shubham Puri"));
        demo.display();
//        demo.clear();
        demo.display();
        demo.putIfAbsent(252,"Shubham");
        System.out.println("------------------------------------");
        demo.display();
        System.out.println("------------------------------------");

        System.out.println(demo.getOrDefault(1234));
    }
}
