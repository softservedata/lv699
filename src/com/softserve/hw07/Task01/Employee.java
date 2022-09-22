package com.softserve.hw07.Task01;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private String employeeld;
    private String name;
    private double salary;


    public static class SalaryCmpr implements Comparator<Employee> {
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary() - o2.getSalary());
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.getSalary() - o.getSalary());
    }


}
