package com.collection.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo
{
    public static void main(String[] args) {
        PriorityQueue<Integer>queue=new PriorityQueue<>((i1,i2)->i2-i1);
        queue.add(1);
        queue.add(200);
        queue.add(-3);
        queue.add(4);
        queue.add(-5);
        while (!queue.isEmpty())
        {
            //for every poll operation heapify process is done
            int poll=queue.poll();
            System.out.println("Poll:"+poll);
        }
        //(-5)--->(-3)----->1----->4----->200
    }
}
