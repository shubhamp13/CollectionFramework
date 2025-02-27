package com.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V>
{
    private  int maxSize;

    public LRUCache(int maxSize) {
        super(10, 0.75f, true);
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }

    public static void main(String[] args) {
        LRUCache<Integer,String>cache=new LRUCache<Integer,String>(3);
        cache.put(362,"Shrikant Surve");
        cache.put(252,"Shubham Puri");
        cache.put(210,"Shubham Chaudhari");
        System.out.println(cache);
        cache.put(110,"Sejal Patankar");
        System.out.println(cache);
    }
}
