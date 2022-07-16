package hw05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    static Employee employee = new Employee();
    static Employee[] employeeArray = {
            new Employee("Emma Watson", 20, 5600),
            new Employee("Mary Clinton", 5, 4500),
            new Employee("Tom Washington", 20, 6800),
            new Employee("Victor Spielberg", 5, 4200),
            new Employee("Clark Wills", 5, 5000)
    };
    Employee[] employeeArraySorted = {
            new Employee("Tom Washington", 20, 6800),
            new Employee("Emma Watson", 20, 5600),
            new Employee("Clark Wills", 5, 5000),
            new Employee("Mary Clinton", 5, 4500),
            new Employee("Victor Spielberg", 5, 4200)
    };

    @BeforeAll
    static void beforeAll() {
        employee.getSortingSalaryDescendingOrder(employeeArray);
    }

    @Test
    void getAllEmployeesOfDepartment() {
        assertEquals("Name: Tom Washington, department number: 20, Salary: 6800\n" +
                        "Name: Emma Watson, department number: 20, Salary: 5600\n",
                employee.getAllEmployeesOfDepartment(20, employeeArray));
    }

    @Test
    void getAllEmployeesOfDepartmentError() {
        assertEquals("There is no employee in department #4",
                employee.getAllEmployeesOfDepartment(4, employeeArray));
    }

    @Test
    void getSortingSalaryDescendingOrder() {
        employee.getSortingSalaryDescendingOrder(employeeArray);
        for (int i = 0; i < employeeArray.length; i++) {
            assertEquals(employeeArraySorted[i].getSalary(), employeeArray[i].getSalary(),
                    "Salary is not sorted");
            assertEquals(employeeArraySorted[i].getName(), employeeArray[i].getName());
            assertEquals(employeeArraySorted[i].getDepartmentNumber(), employeeArray[i].getDepartmentNumber());
        }

    }
}