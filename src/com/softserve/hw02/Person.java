package com.softserve.hw02;


import java.util.Date;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;
    private static final int currentYear = 2022;

    public Person() {
        firstName = "";
        lastName = "";
        birthYear = -1;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return currentYear - birthYear;
    }

    public void input(String fName, String lName, int birthYear) {
              setFirstName(fName);
              setLastName(lName);
              setBirthYear(birthYear);
    }

    public void output() {
        System.out.println("Your First Name: " + getFirstName());
        System.out.println("Your Last Name: " + getLastName());
        System.out.println("Your Birth Year: " + getBirthYear());
        System.out.println("Your Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
        System.out.println("You have successfully changed your data");
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear >= 1920) {
            this.birthYear = birthYear;
        }
        else {
            System.out.println("Please enter the correct value");
        }
    }
}
