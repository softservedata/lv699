package com.softserve.homework.task6.employee;

public class Employee {
    private String name;
    private int age;
    private double salary;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String report() {
        return String.format("Name is :%s,Age :%d,Salary:\u20B4 %.2f",name,age,salary);
    }}
