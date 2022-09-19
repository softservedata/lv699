package com.softserve.hw05.practical_tasks.second;

import java.util.Arrays;

public class AppEmployee {
public static void main(String[] args) {
	In in = new In();
	Employee[]employee=new Employee[5];
	 employee[0]=new Employee("Bogdan", 23, 1000);
	 employee[1]=new Employee("Ivanka", 37, 8000);
	 employee[2]=new Employee("Viktoria", 23, 11000);
	 employee[3]=new Employee("Oleksandr", 25, 500);
	 employee[4]=new Employee("Dmytro", 47, 100);
	 System.out.println(Arrays.toString(employee));
	 System.out.println("Enter number of the department: ");
	 int number=in.number();
	 System.out.println("all employees of a certain department");
	 
	 for(Employee ap:employee) {
		 if(ap.getDepartmentnumber()==number) {
	 System.out.println(ap.toString());
	 }
		 
//System.out.println("this department don't exist");
	 }
	 System.out.println("\narrange workers by the field salary in descending order: ");
	 System.out.println(Arrays.toString(Employee.sort(employee)));
	;
}
}
//Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//all employees of a certain department (enter department number in the console);
//arrange workers by the field salary in descending order.
