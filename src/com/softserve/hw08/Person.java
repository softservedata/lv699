package com.softserve.hw08;

public abstract class Person extends FullName{
    private FullName fullName;
    private int age;

    public Person() {
        fullName = new FullName();
        age = 0;
    }

    public Person(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

    public String info(){
        return String.format("First name: %s, Last name: %s, Age: %d", getFirstName(), getLastName(), getAge());
    }

    public abstract String activity();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
