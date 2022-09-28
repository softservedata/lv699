package com.softserve.hw03;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getBirthYear(){
        return this.birthYear;
    }

    public Person(){
        firstName = "";
        lastName = "";
        birthYear = -1;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(){
        int year = Year.now().getValue();
        return year - birthYear;
    }

    public void input(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Creating a new person...");
        System.out.print("Enter persons first name: ");
        scn.nextLine();
        System.out.print("Enter persons last name: ");
        scn.nextLine();
        System.out.println("Enter persons birth year: ");
        scn.nextInt();
        System.out.println("New person is created!");
    }

    public void output(){
        System.out.println("The persons first name is " + getFirstName());
        System.out.println("The persons last name is " + getLastName());
        System.out.println("The persons age is " + getAge());
    }

    public void changeName (String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }

    public static void main(String[] args) {

        Person person0 = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        person0.input();
        person1.input();
        person2.input();
        person3.input();
        person4.input();
    }

}
