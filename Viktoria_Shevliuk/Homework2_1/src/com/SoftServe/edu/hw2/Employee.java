package com.SoftServe.edu.hw2;

public class Employee {
    static  String totalSum = "this is totalSum";
    //fields
    private String name;
    private double rate;
    private double hours;

    //accessors
    public void setName(String name){
        this.name = name;
    }
    public void setRate(double rate){
        this.rate = rate;
    }
    public void setHours(double hours){
        this.hours = hours;
    }

    public String getName(){
        return this.name;
    }
    public double getRate(){
        return this.rate;
    }
    public double getHours(){
        return this.hours;
    }

    //constructors
    public Employee(){}
    public Employee(String name, double rate){
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name, double rate, double hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    //methods
    public double getSalary(){
        double salary = rate * hours;
        return salary;
    }

    @Override
    public String toString(){
        return "Employee [\nName =" + name +
                ", \n Rate =" + rate +
                ", \n Hours =" + hours +
                ", \n Salary =" + getSalary() +
                ", \n Bonuses =" + getBonuses() + "]\n" + "*********************" ;
    }

    public double changeRate(double rate){
        this.rate = rate;
        return rate;
    }

    public double getBonuses(){
        double bonus = getSalary() * 0.1;
        return bonus;
    }
}
