package com.collection.queue.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EmployeeQueue
{
    public static void main(String[] args) {
        PriorityQueue<Employee>employeeQueue=new PriorityQueue<>(Comparator.comparingInt(Employee::getSalary).reversed());
        employeeQueue.offer(new Employee("Shubham Puri",252,75000));
        employeeQueue.offer(new Employee("Shubham Chaudhari",210,35000));
        employeeQueue.offer(new Employee("Shrikant Surve",362,25000));
        employeeQueue.offer(new Employee("Sejal Patankar",102,95000));
        employeeQueue.forEach(System.out::println);
        System.out.println("Heapify while poll() operation");
        System.out.println("Employee Priority Based on salary");
        System.out.println("-------------------------------------");
        while (!employeeQueue.isEmpty())
        {
            Employee employee=employeeQueue.poll();
            System.out.println(employee);
        }
    }
}
