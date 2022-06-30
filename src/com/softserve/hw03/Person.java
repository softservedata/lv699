package com.softserve.hw03;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {

    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(int birthYear) {
        int age = 2022-birthYear;
        return age;
    }

    public void output(Person a) {
        System.out.println("FirstName and LastName is " + firstName + " " + lastName + "." + "  He/She is " + a.getAge(birthYear) + " years old");
            }
        public void input() {
        Scanner inputscan = new Scanner(System.in);
        System.out.print("Please input tha data in such order: firstName; lastName; birthYeasr: ");
        firstName=inputscan.nextLine();
        lastName = inputscan.nextLine();
        birthYear = inputscan.nextInt();
        }

       public void changeName(String fn, String ln) {
           System.out.println("firstName before changingName = " + firstName + ". "+ "Lastname before changingName = " + lastName + ".");
        lastName=ln;
        firstName=fn;
        System.out.println( " firstname AFTER Changing = " + firstName + "."+ "lastName AFTER Changing = " + lastName + ".   ");


   }


public static void main (String[] args) {
    Person person1 = new Person ("Olga", "Koval");
    Person person2 = new Person ();
    Person person3 = new Person ("Anna", "May");
    Person person4 = new Person ("Adam", "Wiaw");
    Person person5 = new Person ("Oleksandra", "Aga");
    System.out.println("I create 5 objects");
    System.out.println("");
    // Input st2 alla data and birthyear to other students

    person1.setBirthYear(2001);
    person2.input();
    person3.setBirthYear(1989);
    person4.setBirthYear(1976);
    person5.setBirthYear(1980);
    System.out.println("I input information about 5 objects");
    System.out.println("");

    //method get Age
    person1.getAge(2001);
    person2.getAge(1991);
    person3.getAge(1989);
    person4.getAge(1976);
    person5.getAge(1980);
    System.out.println("Method getAge was running");
    System.out.println("");


    person1.output(person1);
    person2.output(person1);
    person3.output(person1);
    person4.output(person1);
    person5.output(person1);
    System.out.println("Method output was running");
    System.out.println("");


    person1.changeName("Iryna", "Koval");
    person2.changeName("Viktor", "Romak");
    person3.changeName("Anna", "August");
    person4.changeName("Arina", "Wiaw");
    person5.changeName("Oleksandra", "Rina");
    System.out.println("I changed the names");



}

}
