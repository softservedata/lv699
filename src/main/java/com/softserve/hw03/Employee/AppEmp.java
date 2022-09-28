package com.softserve.hw03.Employee;

public class AppEmp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Roman", 100, 40);
        System.out.println("Salary of emp1 = " + emp1.getSalary());
        Employee emp2 = new Employee("Ivan", 80, 30);
        System.out.println("Salary of emp2 = " + emp2.getSalary());
        Employee emp3 = new Employee("Maria", 60, 35);
        System.out.println("Salary of emp3 = " + emp3.getSalary());
        //
        emp1.changeRate(200);
        System.out.println("Updated emp1 salary = " + emp1.getSalary());
        //
        System.out.println("Sum of all salaries = " + Employee.getTotalSum());
    }
}
