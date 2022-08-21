package com.softserve.HomeWork.hw07.task1;

import java.util.Objects;
//Create Payment interface with the method calculatePay(), the base class Employee with a string variable employeeld. Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
//        Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
//        Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//        Include a description of federalTaxIdmember in the class of ContractEmployee.
//The calculation formula for the "time-worker“ is: the average monthly
//        salary = hourly rate * number of hours worked
//        For employees with a fixed payment the formula is: the average monthly 	salary = fixed monthly payment
//        Create an array of employees and add the employees with different form of payment.
//        Arrange the entire sequence of workers descending the average monthly wage. Output the employee ID, name, and the average monthly wage for all elements of the list.



public abstract class Employee implements Payment {


    public String employeeName;
    private  int monthlySalary;

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public Employee(String employeeName) {
        this.employeeName = employeeName;
        this.monthlySalary = monthlySalary;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}

