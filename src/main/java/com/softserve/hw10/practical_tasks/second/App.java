package com.softserve.hw10.practical_tasks.second;



public class App {
public static void main(String[] args) {
//	Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
//		surnames and initials
//		name
//		name, middle name and last name
	String surname="Pavlyk";
	String name="Vitalii";
	String patronymic="Ivanovych";
	System.out.println("surname and initials= "+surname+" "+name.charAt(0)+"."+patronymic.charAt(0)+".");
	System.out.println("name= "+name);
	System.out.println("name, middle name and last name= "+name+" "+patronymic+" "+surname);
	
	}




}

