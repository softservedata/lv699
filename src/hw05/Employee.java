package hw05;

import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee() {
        name = null;
        departmentNumber = 0;
        salary = 0;
    }

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.printf("Name: %s, department number: %s, Salary: %s\n", name, departmentNumber, salary);
    }

    public String getString() {
        return "Name: " + name + ", department number: " + departmentNumber + ", Salary: " + salary + "\n";
    }

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Emma Watson", 20, 5600);
        employeeArray[1] = new Employee("Mary Clinton", 5, 4500);
        employeeArray[2] = new Employee("Tom Washington", 20, 6800);
        employeeArray[3] = new Employee("Victor Spielberg", 5, 4200);
        employeeArray[4] = new Employee("Clark Wills", 5, 5000);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter department number: \n>");
        int dpNumber = scan.nextInt();

        Employee answer = new Employee();
        System.out.print(answer.getAllEmployeesOfDepartment(dpNumber, employeeArray));


        System.out.println("\nWorkers by the field salary in descending order: ");
        answer.getSortingSalaryDescendingOrder(employeeArray);
        for (int i = 0; i < employeeArray.length; i++) {
            employeeArray[i].display();
        }
    }

    public String getAllEmployeesOfDepartment(int dpNumber, Employee[] array) {
        int count = 0;
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (dpNumber == array[i].getDepartmentNumber()) {
                result += array[i].getString();
                count++;
            }
        }
        if (count == 0) {
            result = "There is no employee in department #" + dpNumber;
        }
        return result;
    }

    public void getSortingSalaryDescendingOrder(Employee[] array) {
        int tmp, tmpDep;
        String tmpName;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].getSalary() < array[j].getSalary()) {
                    tmp = array[i].getSalary();
                    array[i].setSalary(array[j].getSalary());
                    array[j].setSalary(tmp);
                    tmpName = array[i].getName();
                    array[i].setName(array[j].getName());
                    array[j].setName(tmpName);
                    tmpDep = array[i].getDepartmentNumber();
                    array[i].setDepartmentNumber(array[j].getDepartmentNumber());
                    array[j].setDepartmentNumber(tmpDep);
                }
            }
        }
    }
}
