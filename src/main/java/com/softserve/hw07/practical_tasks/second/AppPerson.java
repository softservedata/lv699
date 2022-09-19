package com.softserve.hw07.practical_tasks.second;

import java.util.ArrayList;
import java.util.List;

public class AppPerson {
////	Create next structure. 
//	In abstract class Person with property name, declare abstract method print(). 
//	In other classes in body of method print() output text “I am a …”. 
//	In class Staff declare abstract method salary(). 
//	In each concrete class create constant TYPE_PERSON. 
//	Output type of person in each constructors. 
//	Create array of Person and add some Teachers, Cleaners and Students to it. 
//	Call method print() for all of it. Call method salary() for all Teachers and Cleaner
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();

	    list.add(new Cleaner("Sam","Cleaner"));
	    list.add(new Student("Ivan","Student"));
	    list.add(new Teacher("Barsik","Teacher"));
	    list.add(new Teacher("Hayme","Teacher"));
	    list.add(new Student("Muhtar","Student"));
	    list.add(new Cleaner("Jack","Cleaner"));
	    for (Person person : list) {
	    	 System.out.println(person); 
	       System.out.println(person.print()); 
	       if(person instanceof Teacher) {
	       System.out.println("Salary= "+((Teacher)person).salary()); 
	       }
	       if(person instanceof Cleaner) {
		       System.out.println("Salary= "+((Cleaner)person).salary()); 
		       }
	    }

	}

}
