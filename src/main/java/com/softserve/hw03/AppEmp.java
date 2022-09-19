package com.softserve.hw03;

import com.softserve.hw11.refactorHW03.InvalidNumberException;

public class AppEmp {
    public static void main(String[] args) {
    	try {
        Employee emp1 = new Employee("Ivan", 100, 40);
        Employee emp2 = new Employee("Petro", 200, 40);
        Employee emp3 = new Employee("Petro", 500, 40);
        System.out.println("emp1.getSalary() = " + emp1.getSalary());
        System.out.println("emp1.getSalary() = " + emp1.getSalary());
        System.out.println("emp2.getSalary() = " + emp2.getSalary());
        System.out.println("emp3.getSalary() = " + emp3.getSalary());
        //
        emp1.changeRate(300);
        System.out.println("Updated emp1.getSalary() = " + emp1.getSalary());
        //
        System.out.printf("getTotalSum() = " +  Employee.getTotalSum());
    	}
    	catch (InvalidNumberException e) {
  	      System.err.println(e.getMessage() + "\n");
  	    e.printStackTrace();
  	   }
    }
}
