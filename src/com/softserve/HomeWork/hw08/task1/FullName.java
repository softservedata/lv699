package com.softserve.HomeWork.hw08.task1;

public class FullName {
    private String firstName;
    private String lastName;
    public FullName() {

    }
    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }


    void info() {
        System.out.println("First name:" + firstName + ", Last name:" + lastName);

    }
}
