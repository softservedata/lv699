package com.softserve.hw06.Task02;

public class Developer extends Employee{
    private String position;
    private String name;
    private int age;
    private int salary;

    public String getPosition() {
        return position;
    }

    public Developer(String name, int age,String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Position: %s, Salary: \u20B4 %.2f.", getName(),getAge(),getPosition(),getSalary());
    }

}
