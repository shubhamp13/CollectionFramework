package com.collection.queue.priorityqueue;

import java.util.Objects;

public class Employee
{
    private String name;
    private int employeeId;
    private int salary;

    public Employee(String name, int employeeId, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,employeeId);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
            return false;
        if(this == obj)
            return true;
        if(!(obj instanceof Employee))
            return false;
        Employee other = (Employee) obj;
        return Objects.equals(name,other.name) && employeeId==other.employeeId;
    }

    @Override
    public String toString() {
        return "Name:"+name+" Employee Id:"+employeeId+" Salary:"+salary;
    }
}
