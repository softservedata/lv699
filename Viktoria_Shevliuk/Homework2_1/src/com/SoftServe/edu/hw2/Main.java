package com.SoftServe.edu.hw2;

public class Main {

    public static void main(String[] args) {
        //creating first instance
        Employee first = new Employee();
        first.setName("John");
        first.setRate(45.6);
        first.setHours(36.5);
        System.out.println(first.toString());

        //creating second instance with constructor with 2 parameters
        Employee second = new Employee("Alex", 34.2);
        second.setHours(15.3);
        System.out.println(second.toString());

        //creating third instance with constructor with 3 parameters
        Employee third = new Employee("Mike", 56.4, 30);
        System.out.println(third.toString());
        System.out.println("lets change Mike's rate to 50.4");
        third.changeRate(50.4);
        System.out.println(third.toString());
    }
}
