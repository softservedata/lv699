package com.softserve.HomeWork.hw08.task1;

public class Student extends Person {
    private int numberCourse;


    public Student(String firstName, String lastName, int age, int numberCourse) {
        super(firstName, lastName, age);
        this.numberCourse = numberCourse;

    }

    @Override
    void info() {
        System.out.println("First name: " + getFirstName() + ", Last name: " +
                getLastName() + ", Age: " + getAge() + ", Course: " + numberCourse);

    }

    @Override
    public String activity() {
        System.out.println("I study at university");
        return "I Study at university";
    }
}

