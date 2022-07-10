package com.softserve.HomeWork.hw03;

public class AppEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100,30);
        System.out.println("emp1.getSalary()= "+ emp1.getSalary());
        System.out.println("emp1.getSalary()= "+ emp1.getSalary());
        Employee emp2 = new Employee("Petro", 100,20);
        System.out.println("emp2.getSalary()= "+ emp2.getSalary());
        Employee emp3 = new Employee("Vovan", 80,30);
        System.out.println("emp3.getSalary()= "+ emp3.getSalary());
        //
        System.out.println("getTotalSum = "+ Employee.getTotalSum());
        //
        emp1.changeRate(80);
        System.out.println("Updated emp1.getSalary()= "+ emp1.getSalary());
        //
        System.out.println("getTotalSum = "+ Employee.getTotalSum());

    }
}
