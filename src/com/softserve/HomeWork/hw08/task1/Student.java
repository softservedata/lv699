package com.softserve.HomeWork.hw08.task1;

public class Student extends Person {
    private int numberCourse;


    public Student(String firstName, String lastName, int age, int numberCourse) {
        super(firstName, lastName, age);
        this.numberCourse = numberCourse;

    }

    @Override
    public void info() {
        System.out.println("First name: " + getFirstName() + ", Last name: " +
                getLastName() + ", Age: " + getAge() + ", Course: " + numberCourse);

    }

    @Override
    public String activity() {
        return "I Study at university";
    }
}

