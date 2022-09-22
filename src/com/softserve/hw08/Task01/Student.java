package com.softserve.hw08.Task01;

public class Student extends Person {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
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

        return super.info() + ", Course: " + getCourse();
    }


    @Override
    public String activity() {
        return "I study at university";
    }
}
