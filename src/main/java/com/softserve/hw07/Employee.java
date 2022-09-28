package com.softserve.hw07;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Payment{
    private String name;
    private String employeeId;
    private int salary;

    public static class bySalary implements Comparator<Employee>{
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return - (emp1.getSalary() - emp2.getSalary());
        }
    }

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public Employee() {
        name = "";
        employeeId = "";
        salary = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int calculatePay() {
        int salary = 0;
        setSalary(salary);
        return salary;
    }

    @Override
    public String toString() {
        return "\n\t Employee No." + employeeId +
                " name = " + name +
                ", salary = " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(employeeId, employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeId);
    }

}
