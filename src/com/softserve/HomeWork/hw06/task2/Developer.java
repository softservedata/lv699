package com.softserve.HomeWork.hw06.task2;



public class Developer extends Employee {
    private String level;
    public static double  i;

    public static void setI(double i) {
        Developer.i = i;
    }

    public double getI() {
        return i;
    }

    public Developer(String name, int age, double salary, String level) {
        super(name, age, salary);
        this.level = level;

    }
    @Override
    public  String report(){
        //return "name "+getName()+" age "+getAge()+" salary "+getSalary()+" level "+level;
        //return String.format(, "name"+getName()+"age"+getAge()+"salary"+getSalary()+"level"+level);
        return String.format("Name: %s, Age: %s, Salary: %s, Level: %s", getName(), getAge(), getSalary(), level);
    }
//    public double levelSalary(double grade){
//
//       return grade=i*getSalary();
//
//    }
    }

