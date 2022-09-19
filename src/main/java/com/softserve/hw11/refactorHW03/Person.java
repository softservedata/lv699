package com.softserve.hw11.refactorHW03;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Person {
    private String firstname;
    private String lastname;
    private int birthYear;
    private int Year = 2022;
    private static  int Age=0;
    Scanner scan = new Scanner(System.in);

    public Person() {
        firstname = "";
        lastname = "";
        birthYear = 0;
        Year = 2022;
        Age=0;
    }
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    private int wrongBirthYear(int birthYear) throws InvalidNumberException{
	     if(birthYear<0){
	       throw new InvalidNumberException("BirthYear must be bigger than 0");
	      }
	     else return birthYear;
	   }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public void  setbirthYear(int birthYear) {
        this.birthYear = wrongBirthYear(birthYear);
    }
    public int getAge() {
            Age=Year - getBirthYear();
            return Age;
        }

        public void input(){
        	
            System.out.println("Enter Firstname: ");
            setFirstname(scan.nextLine());
            System.out.println("Enter Lastname: ");
            setLastname(scan.nextLine());
            System.out.println("Enter BirthYear: ");
            setbirthYear(scan.nextInt());
        	
        	
        }
    public void changeName(){
        System.out.println("Enter Firstname: ");
        setFirstname(scan.nextLine());
        System.out.println("Enter Lastname: ");
        setLastname(scan.nextLine());

    }
    public String output() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }

    }
