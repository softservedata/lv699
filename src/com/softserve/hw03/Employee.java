package com.softserve.hw03;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;
    private static int totalSalary;

    public String getName(){
        return this.name;
    }

    public int getRate(){
        return this.rate;
    }

    public int getHours(){
        return this.hours;
    }

    public Employee() {
        name = "";
        rate = -1;
        hours = -1;
    }
    public Employee(String name, int rate){
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSalary = totalSalary + (rate * hours);
    }

    public int getSalary(){
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public void changeRate(int rate){
        this.rate = rate;
    }

    public double getBonuses(){
        return rate * hours * 0.1;
    }

    public static void main(String[] args) {
        Employee employee0 = new Employee("Ivan", 20, 172);
        Employee employee1 = new Employee("Maria", 30, 160);
        Employee employee2 = new Employee("Vasyl", 28, 104);

        System.out.println("The total salary of all workers is " + totalSalary + " USD.");
    }

}
