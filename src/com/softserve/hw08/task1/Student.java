package com.softserve.hw08.task1;

public class Student extends Person {
    private int course;

    public Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

   @Override
   public void info() {
        System.out.println("First name: " + getFirstName() + ", Last name: " + getLastName() + ", Age: " + getAge() + ". Course: " + getCourse() + ".");
    }

    @Override
    public String activity() {
        String s = " I study at university! ";
        return s;
    }
}
