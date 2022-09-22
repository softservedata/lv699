package com.softserve.hw07.Task01;

public class ContractEmployee extends Employee implements Payment{
    private String name;
    private double monthlyPayment;
    private final int federalTaxIdmember;
    private double salary;

    public ContractEmployee(String name , int monthlyPayment, int federalTaxIdmember) {
        this.name = name;
        this.monthlyPayment = monthlyPayment;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getFederalTaxIdMember() {
        return federalTaxIdmember;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        setSalary(getMonthlyPayment());
        return getSalary();
    }

    @Override
    public String toString() {
        return getFederalTaxIdMember() + " " + getName() + " " + calculatePay();
    }
}
