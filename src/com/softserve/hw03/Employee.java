package com.softserve.hw03;

public class Employee {
    private String name;
    private double salary;
    private double bonus = 0.1;
    private int rate;
    private int hours;
    private static double totalSum = 0;


    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }
    public int getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        this.salary= 0;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        this.hours = 0;
        this.salary = 0;
    }

    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
        salary = 0;
    }

    // getsalary method
    public double getSalary() {
        if (salary == 0) {
            salary = getRate() * getHours();
            totalSum = totalSum + salary;
        }
        return salary;
    }

    @Override
    // method toString
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    // ChangeRate method
    public void changeRate(int rate1) {
        if (salary > 0) {
            totalSum = totalSum - salary;
        }
        setRate(rate);
        getSalary();

    }
        public double getBonuses() {
        return getSalary() * bonus;
        }

public static void main (String[] args) {
        Employee emp1 = new Employee("One", 25 , 168);
        Employee emp2 = new Employee("Two", 12 , 190);
        Employee emp3 = new Employee("Three", 31 , 150);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        System.out.println("Salary one: " + emp1.getSalary());
        System.out.println("Salary two: " + emp2.getSalary());
        System.out.println("Salary three: " + emp3.getSalary());

        System.out.println("Salary total: " + Employee.totalSum);
}
    /*


Display the total salary of all workers to screen*/



}
