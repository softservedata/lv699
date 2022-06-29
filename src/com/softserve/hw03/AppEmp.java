package com.softserve.hw03;

public class AppEmp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100, 40);
        System.out.println("emp1.getSalary() = " + emp1.getSalary());
        System.out.println("emp1.getSalary() = " + emp1.getSalary());
        Employee emp2 = new Employee("Petro", 200, 40);
        System.out.println("emp2.getSalary() = " + emp2.getSalary());
        Employee emp3 = new Employee("Petro", 500, 40);
        System.out.println("emp3.getSalary() = " + emp3.getSalary());
        //
        emp1.changeRate(300);
        System.out.println("Updated emp1.getSalary() = " + emp1.getSalary());
        //
        System.out.printf("getTotalSum() = " +  Employee.getTotalSum());
    }
}
