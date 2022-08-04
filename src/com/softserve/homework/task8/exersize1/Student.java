package com.softserve.homework.task8.exersize1;

public class Student extends Person{
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
    public String info() {
        return  ""+ super.info()+".Course: "+course;

    }

    @Override
    public String activity() {
        String activity ="I study at university. ";
        return activity;
    }
}
