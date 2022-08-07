package com.softserve.hw08;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info(){
        String info = String.format("First name: %s, Last name: %s, Age: %d", fullName.getFirstName(), fullName.getLastName(), getAge());
        return info;
    }

    public abstract String activity();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
