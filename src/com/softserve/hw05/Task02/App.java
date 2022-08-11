package com.softserve.hw05.Task02;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Andriy",54, 125000);
        Developer developer = new Developer("Taras",32, "Average Java developer" ,32735.35);

        System.out.println(employee.report());
        System.out.println(developer.report());


    }

}
