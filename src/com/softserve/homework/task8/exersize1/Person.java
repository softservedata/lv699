package com.softserve.homework.task8.exersize1;

public abstract class Person  {
private FullName fullName;
    private int age;

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

    public Person(String firstName, String lastName, int age) {
       this.fullName=new FullName(firstName,lastName);
        this.age = age;
    }

    public String info() {
        return  fullName.toString()+  ". Age: " + age;

    }

    public abstract String activity();
}