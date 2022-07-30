package com.softserve.hw07.task1;

public class SalariedEmployee extends Employee implements Payment {
    private double monthSalary;
        private double finalPayment;
    private String socialSecurityNumber;


    public SalariedEmployee(String employeeld, double salary, String socialSecurityNumber) {
        this.employeeld = employeeld;
        this.monthSalary = salary;
        this.socialSecurityNumber = socialSecurityNumber;

    }

    public SalariedEmployee() {
        employeeld = "null salaryName";
        monthSalary = 0;
        finalPayment = 0;
        socialSecurityNumber = " XXX ";
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public double getFinalPayment() {
        return finalPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFinalPayment(double finalPayment) {
        this.finalPayment = finalPayment;
    }

    @Override
    public double calculatePay() {
        setFinalPayment(monthSalary);
        System.out.println("SalariedEmployee.calcukatePay() is running....");
        return getFinalPayment();
    }

    @Override
    public String toString() {
        return "\n" + "SalariedEmployee: 1. Name: " + employeeld + ". " +
                "2. monthSalary=" + monthSalary + ". " +
                "3. finalPayment=" + finalPayment + ". " +
                "4. socialSecurityNumber='" + socialSecurityNumber;
    }
}
