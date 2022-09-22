package com.softserve.hw08.Task01;

public abstract class Person {
    private FullName fullName;
    private int age;

    public int getAge() {
        return age;
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    public String info() {
        return String.format("First name: %s, Last name: %s, Age: %d", fullName.getFirstName(), fullName.getLastName(), getAge());
    }

    public abstract String activity();



}
