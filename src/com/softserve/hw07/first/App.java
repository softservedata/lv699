package com.softserve.hw07.first;

import java.util.*;

public class App {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("1","Oksana", "2345",23,48));
        employees.add(new ContractEmployee("2","Bogdan",3978,3000));
        employees.add(new ContractEmployee("3","Orest",5438,1000));
        employees.add(new SalariedEmployee("4","Stepan", "4856",100,42));
        employees.add(new ContractEmployee("5","Vitalii",9653,1200));
        employees.add(new SalariedEmployee("6","Danylo", "1425",300,15));
        employees.add(new ContractEmployee("7","Vasyl",2367,1500));
        for (Employee employee : employees) {
            if (employee instanceof SalariedEmployee) {
                int salary = ((SalariedEmployee) employee).calculatePay();
                System.out.println(employee);
                System.out.println("Monthly wage: "+salary);
            }
            else if (employee instanceof ContractEmployee) {
                int salary = ((ContractEmployee) employee).calculatePay();
                System.out.println(employee);
                System.out.println("Monthly wage: "+salary);
            }

    }
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee st1, Employee st2) {
                return -(st1.calculatePay() - st2.calculatePay());
            }
        }
        );
        System.out.println("\nSorted array: ");
            for (Employee employee : employees) {
                System.out.println("Employee id:"+ employee.getEmployeeId()+" Name: "+employee.getName()+"\nmonthly wage: "+ employee.calculatePay());
            }
////    Create Payment interface with the method calculatePay(), the base class Employee with a string variable employeeld.
////    Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
////    Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
////    Describe the string variable socialSecurityNumber in the class SalariedEmployee .
////    Include a description of federalTaxIdmember in the class of ContractEmployee.
////    The calculation formula for the "time-worker“ is: the average monthly
////    salary = hourly rate * number of hours worked
////    For employees with a fixed payment the formula is: the average monthly 	salary = fixed monthly payment
////    Create an array of employees and add the employees with different form of payment.
////    Arrange the entire sequence of workers descending the average monthly wage. Output the employee ID,
////    name, and the average monthly wage for all elements of the list.
//
//            }
        }
    }