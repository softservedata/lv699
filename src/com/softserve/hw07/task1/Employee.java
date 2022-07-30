package com.softserve.hw07.task1;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    protected String employeeld;
    private double finalPayment;


    public static class ByFinalPayment implements Comparator<Employee> {
        @Override
        public int compare(Employee a, Employee b) {
            return (int) (a.getFinalPayment() - b.getFinalPayment());
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeld, employee.employeeld);
    }

    public double getFinalPayment() {
        return finalPayment;
    }

    public void setFinalPayment(double finalPayment) {
        this.finalPayment = finalPayment;
    }

    public double calculatePay() {
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeld);
    }

    public int compareTo(Employee c) {
        return (int) (-finalPayment + c.getFinalPayment());
    }

}
