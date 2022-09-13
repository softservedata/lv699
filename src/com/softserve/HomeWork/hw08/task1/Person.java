package com.softserve.HomeWork.hw08.task1;

public abstract class Person extends FullName {
    private FullName fullName;
    private int age;

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Person(String firstName, String lastName, int age) {
        super(firstName,lastName);
        this.age = age;
    }
    void info(){
        System.out.println("First name: " + getFirstName() + ", Last name: " +
                getLastName() + ", Age: " + getAge());

    }
    public abstract String activity();

}
