package com.softserve.hw09.third_task;

import java.util.*;

public class AppMain {
public static void main(String[] args) {
	List <Student> students=new ArrayList<>();
	students.add(new Student("Maria",1));
	students.add(new Student("Maks",2));
	students.add(new Student("Yaroslav",4));
	students.add(new Student("Ivan",3));
	students.add(new Student("Iryna",1));
	System.out.println("List of students: "+students);
	Integer b=Src.scanner();
	System.out.println("This students "+Student.printStudents(students,b)+" study in this course: "+b);
	Collections.sort(students,new Student.ByName());
	System.out.println("List of students sorted by name: "+students);
	Collections.sort(students,new Student.ByCourse());
	System.out.println("List of students sorted by course: "+students);
	
}
}
