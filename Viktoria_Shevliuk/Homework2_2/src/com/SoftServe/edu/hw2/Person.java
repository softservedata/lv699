package com.SoftServe.edu.hw2;

import java.util.Scanner;

public class Person {
//поля
    private String firstName;
    private String lastName;
    private int birthYear;
//аксесори
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getBirthYear(){
        return birthYear;
    }

//конструтори
    public Person(){}
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

//методи
    public int getAge(){
        int age = 2022 - birthYear;
        return age;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input person's name: ");
        String name = sc.nextLine();
        setFirstName(name);
        System.out.println("Input person's lastname: ");
        String lastname = sc.nextLine();
        setLastName(lastname);
        System.out.println("Input person's birth year: ");
        int age = sc.nextInt();
        setBirthYear(age);
    }

    public void output(){
        System.out.println("\nPerson's name: "+ getFirstName()
        + "\nPerson's lastname: "+ getLastName()
        + "\nPerson's age: "+ getAge() + "\n***************");
    }

    public void changeName(String fn, String ln){
    this.firstName = fn;
    this.lastName = ln;
    }


}
