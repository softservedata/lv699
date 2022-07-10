package com.softserve.hw05.practicalTask;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
   // Create a class Employee with fields name, department number, salary.
    private String name;
    private int department_number;
    private int salary;

    //Create five objects of class Employee.

    public Employee(String name, int department_number, int salary) {
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    public Employee() {
            }



    public static void main(String[] args) {
        Employee empl1 = new Employee("Vivaldi", 12, 25000);
        Employee empl2 = new Employee("Mozard", 22, 89000);
        Employee empl3 = new Employee("Chopin", 22, 65000);
        Employee empl4 = new Employee("Beethoven", 25, 78000);
        Employee empl5 = new Employee("Schubert", 22, 96000);

        Employee emp0 = new Employee();
        emp0.nDepartment(empl1,empl2, empl3, empl4, empl5);
        //Display arrange workers by the field salary in descending order.
        int arrayEmployee [] ;
        arrayEmployee = new int [5];
        arrayEmployee[0] = empl1.getSalary();
        arrayEmployee[1] = empl2.getSalary();
        arrayEmployee[2] = empl3.getSalary();
        arrayEmployee[3] = empl4.getSalary();
        arrayEmployee[4] = empl5.getSalary();

        System.out.println(Arrays.toString(arrayEmployee));

        sortSalary(arrayEmployee);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    //Display all employees of a certain department (enter department number in the console);

    public void nDepartment(Employee empl1, Employee empl2, Employee empl3, Employee empl4, Employee empl5) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input department number (12,22,25)");
        int n = sc.nextInt();
        boolean nobody = true;
        if (empl1.getDepartment_number() == n) {
            System.out.println("Employees from " + n + " depertment is: " + empl1.name);
            nobody = false;
        }
        if (empl2.getDepartment_number() == n) {
            System.out.println("Employees from " + n + " depertment is: " + empl2.name);
            nobody = false;
        }
        if (empl3.getDepartment_number() == n) {
            System.out.println("Employees from " + n + " depertment is: " + empl3.name);
            nobody = false;
        }
        if (empl4.getDepartment_number() == n) {
            System.out.println("Employees from " + n + " depertment is: " + empl4.name);
            nobody = false;
        }
        if (empl5.getDepartment_number() == n) {
            System.out.println("Employees from " + n + " depertment is: " + empl5.name);
            nobody = false;
        }
        if (nobody == true) {
            System.out.println("Nobody is from this department");
        }
    }

    public static void sortSalary(int arrayEmployee[]) {
        boolean isSorted = true;
        int tmp;

        for (int i = 0; i < arrayEmployee.length-1; i++) {
            isSorted=true;
            for (int j=0; j<arrayEmployee.length-1-i; j++) {
                if (arrayEmployee[j]<arrayEmployee[j+1]) {
                    tmp = arrayEmployee[j];
                    arrayEmployee[j]= arrayEmployee[j+1];
                    arrayEmployee[j+1]= tmp;
                    isSorted = false;
                    }
            }

          if ( isSorted) {
              break;
          }

        }
        for ( int i: arrayEmployee)
            System.out.print(i + " ");
        //System.out.print(Arrays.toString(arrayEmployee));

    }


}
