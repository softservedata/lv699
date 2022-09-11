package com.softserve.HomeWork.hw08.task1;

public abstract class Person extends FullName {
    private FullName fullName;

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

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
    public void info(){
        System.out.println(", Age:" +age);

    }
    public abstract String activity();

}
