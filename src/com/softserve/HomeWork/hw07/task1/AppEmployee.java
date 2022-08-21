package com.softserve.HomeWork.hw07.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class AppEmployee {

    public static void main(String[] args) {

        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("JavaDeveloperJunior", 246, 90, 160);
        employees[1] = new SalariedEmployee("JavaSkriptDeveloper", 115, 180, 160);
        employees[2] = new ContractEmployee("JavaDeveloperSenior", 126, 1500);
        employees[3] = new ContractEmployee("JavaDeveloperSenior", 258, 1600);
        System.out.println("befor Sort");
        for (Employee each : employees) {
            if (each instanceof ContractEmployee) {
                int salary = ((ContractEmployee) each).calculatePay();
            }
            if (each instanceof SalariedEmployee) {
                int salary = ((SalariedEmployee) each).calculatePay();
            }
        }
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) -(o1.calculatePay() - o2.calculatePay());
            }
        });

        System.out.println("Sort by monthly wage: \n");
        for (Employee each : employees) {
            System.out.println(each.toString() +  each.calculatePay());
        }

        }



            }





