package com.softserve.hw08.task1;

public abstract class Person extends FullName {
   private FullName fullName;
   private int age;

    public Person(String firstName, String lastName, int age) {
       super(firstName, lastName);
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + getAge() + ".");
    }
    public abstract String activity();




}
