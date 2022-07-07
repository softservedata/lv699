package com.SoftServe.edu.hw2;

public class Main {

    public static void main(String[] args) {
	Person p1 = new Person();
	p1.setFirstName("Nelly");
	p1.setLastName("Baker");
	p1.setBirthYear(1667);
	p1.output();

	Person p2 = new Person("Tori", "Vega");
	p2.setBirthYear(2000);
	p2.output();

	Person p3 = new Person();
	p3.input();
	p3.output();

	Person p4 = new Person();
	p4.input();
	System.out.println("Lets change his/her name");
	p4.changeName("Tuck", "Bennet");
    p4.output();

    Person p5 = new Person("Ben", "Bovvie");
    p5.setBirthYear(2005);
    p5.output();
    System.out.println("Lets change his/her name");
    p5.changeName("Andie", "Coover");
    p5.output();



    }
}
