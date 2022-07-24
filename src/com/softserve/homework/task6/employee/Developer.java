package com.softserve.homework.task6.employee;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name is :%s,Age :%d,Position: %s,Salary:\u20B4 %.2f", getName(), getAge(), position, getSalary());

    }


    public static void main(String[] args) {
        Employee developer1=new Employee("Developer1",31,1500);
        Employee developer2= new Developer("Developer2",52,"boss",5000);
        System.out.println(developer1.report());
        System.out.println(developer2.report());
    }

    }