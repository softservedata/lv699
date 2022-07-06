package com.softserve.homework.task3;


import java.util.Scanner;

public class Inp {

    Scanner scanner = new Scanner(System.in);
    public String inputFirstName(){
        System.out.println("Enter you first name :" );
        String firstName= scanner.nextLine();
        return firstName;
    }
    public String inputLastName(){
        System.out.println("Enter you last name :" );
        String lastName= scanner.nextLine();
        return lastName;
    }
    public int inputBirthYear(){
        System.out.println("Enter you birthday year :" );
        int birthYear= scanner.nextInt();
        return birthYear;
    }
    public void close() {
        scanner.close();
    }

}