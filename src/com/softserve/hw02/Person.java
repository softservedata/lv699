package com.softserve.hw02;

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
        int age=2022-birthYear;
        return age;
    }

    public void output() {
        System.out.println("FirstName and LastName is " + firstName + " " + lastName + "." + "  He/She is " + (2022-birthYear) + " years old");
            }

       public void changeName(String fn, String ln) {
        lastName=fn;
        firstName=ln;
        System.out.print("lastName = " + lastName + "    ");
       System.out.println("firstName = " + firstName);

   }

   /* Create Console Application project in Java.
    Add class Person to the project.
    Class Person should consist of
    three private fields: firstName, lastName and birthYear (the birthday year)
    properties for access to these fields
    default constructor and constructor with 2 parameters (first and last names)
    methods:
    getAge() - to calculate the age of person
    input() - to input information about person
    output() - to output information about person
    changeName(String fn, String ln) - to change the first name or/and last name of person

    In the method main() create 5 objects of Person type and input information about them.*/
public static void main (String[] args) {
    Person person1 = new Person ("Olga", "Koval");
    person1.setBirthYear(2001);
    person1.getAge(2001);
    person1.output();
    System.out.println(person1.getAge(2001));
    person1.changeName("Olga", "Koval");


    Person person2 = new Person ("Igor", "Romak");
    person2.setBirthYear(1991);
    person2.getAge(1991);
    person2.output();
    System.out.println(person2.getAge(1991));
    person2.changeName("Igor", "Romak");

    Person person3 = new Person ("Anna", "May");
    person3.setBirthYear(1989);
    person3.getAge(1989);
    person3.output();
    System.out.println(person3.getAge(1989));
    person3.changeName("Anna", "May");
}

}
