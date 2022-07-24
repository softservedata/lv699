package com.softserve.hw07;

public class ContractEmployee extends Employee implements Payment {
    private double hourlyRate;
    private int hours;
    private double finalPayment;
    private int federalTaxIdmember;

    public ContractEmployee() {
        employeeld = "null contractName";
        hourlyRate = 1;
        hours = 1;
        finalPayment = 0;
        federalTaxIdmember = 0;
    }

    public ContractEmployee(String employeeld, double hourlyRate, int hours, int federalTaxIdmember ) {
        this.employeeld = employeeld;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public String toString() {
        return "\n"+ "ContractEmployee: 1. Name: " + employeeld + ". " +
                "2. hourlyRate = " + hourlyRate + ". " +
                "3. hours = " + hours + ". " +
                "4. finalPayment = " + finalPayment + ". " +
                "5. federalTaxIdmember = " + federalTaxIdmember;
    }

    @Override
    public double getFinalPayment() {
        return finalPayment;
    }

    public void setFinalPayment(double finalPayment) {
        this.finalPayment = finalPayment;
    }

    @Override
    public double calculatePay() {
        setFinalPayment(hourlyRate * hours);
        System.out.println("ContractEmployee.calcukatePay() is running....");
        return finalPayment;
    }
}
