package com.collection.list.linkedlist;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods
{
    private  LinkedList<String>linkedList=new LinkedList<String>();

    public boolean add(String data)
    {
        return linkedList.add(data);
    }
    public boolean addAll(Collection<String> data)
    {
        return linkedList.addAll(data);
    }
    public void addFirst(String data)
    {
        linkedList.addFirst(data);
    }
    public void addLast(String data)
    {
        linkedList.addLast(data);
    }
    public String remove(int index)
    {
        return linkedList.remove(index);
    }
    public boolean remove(String data)
    {
        return linkedList.remove(data);
    }
    public String removeFirst()
    {
        return linkedList.removeFirst();
    }
    public String  removeLast()
    {
        return linkedList.removeLast();

    }
    public boolean removeIf(String data)
    {
        return linkedList.removeIf((s)->s.equals(data));
    }

    public static void main(String[] args)
    {
        LinkedListMethods linkedListMethods=new LinkedListMethods();
        linkedListMethods.addFirst("a");
        linkedListMethods.addAll(List.of("e","i","o","u"));
        linkedListMethods.addLast("z");
        System.out.println(linkedListMethods.linkedList);
        System.out.println(linkedListMethods.removeIf("z"));
        System.out.println(linkedListMethods.linkedList);
        System.out.println(linkedListMethods.removeFirst());
        System.out.println(linkedListMethods.removeLast());
        System.out.println("After Remove First And Last");
        System.out.println(linkedListMethods.linkedList);
       }
}



