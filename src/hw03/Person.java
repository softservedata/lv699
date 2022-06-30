package hw03;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    Scanner scan = new Scanner(System.in);

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

        person0.output();
        person1.output();
        person2.output();
        person3.output();
        person4.output();

        person3.changeName("Steve", "Jobs");
        person3.output();
    }

    public Person() {
        firstName = "Bill";
        lastName = "Gates";
        birthYear = 2001;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }

    public void input() {
        System.out.print("Enter firstname: ");
        firstName = scan.nextLine();
        System.out.print("Enter lastname: ");
        lastName = scan.nextLine();
        System.out.print("Enter birthYear: ");
        birthYear = scan.nextInt();
        System.out.println("");
    }

    public void output() {
        System.out.printf("\nFirstname: %s, Lastname: %s, BirthYear: %s, Age: %s", firstName, lastName, birthYear, +
                getAge());
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
