package com.softserve.hw06.second_task;

public class Developer extends Employee{
    private String position ;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return super.report()+", Position: "+ position;
    }
}
