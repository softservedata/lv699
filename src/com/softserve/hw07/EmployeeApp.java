package com.softserve.hw07;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add (new ContractEmployee("Ivan", "202", 3215));
        employees.add(new SalariedEmployee("Petro", "614", 160, 25));
        employees.add (new ContractEmployee("Stefan", "555", 2980));
        employees.add(new SalariedEmployee("Julia", "190", 172, 20));
        employees.add (new ContractEmployee("Pavlo", "722", 3750));
        employees.add(new SalariedEmployee("Svitlana", "248", 100, 23));

        for (Employee emp : employees){
            emp.calculatePay();
        }

        System.out.println("Original list of employees: " + employees);

        employees.sort(new Employee.bySalary());

        System.out.println("List of employees sorted by salary: " + employees);

    }
}
