package com.softserve.hw06.employee;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ivan", 32, 2648.30);
        System.out.println(e1.report());
        Developer dev1 = new Developer("Roman", 30, "Junior Java Developer", 815.50);
        System.out.println(dev1.report());
    }
}
