package com.softserve.homework.task2;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int age;
    private final int YEAR = 2022;
    Scanner scanner;

    public Person() {
        firstName = "";
        lastName = "";
        birthYear = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        birthYear = 0;
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
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public int getAge() {
        age = YEAR - birthYear;
        return age;
    }

    public void getInputs() {
        scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Please, enter your first name: ");
        String firstName = scanner.nextLine();
        person.setFirstName(firstName);
        System.out.println("Please, enter your last name: ");
        String lastName = scanner.nextLine();
        person.setLastName(lastName);
        System.out.println("Please, enter your birthday: ");
        int birthYear = scanner.nextInt();
        person.setBirthYear(birthYear);

        scanner.close();
    }



    public void output() {
     System.out.println("You are : "+firstName+" " + lastName+ ",  your birthday is: "+birthYear+".");
        System.out.println("Your age is:"+age);
    }
 public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
getFirstName();
getLastName();
    }
}
