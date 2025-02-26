package com.collection.list.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(8);
        stack.push(0);
        stack.push(3);
        stack.push(1);
        stack.push(9);
        stack.push(9);
        stack.push(18);
        stack.push(9);

        System.out.println("Top of the stack is removed :"+stack.pop());
        System.out.println("Top of the stack is :"+stack.peek());
        System.out.println("The index of 18 in stack is "+stack.search(100));//8
        System.out.println(stack.empty());

    }
}
