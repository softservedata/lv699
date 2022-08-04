package com.softserve.hw07;

public class SalariedEmployee extends Employee implements Payment {
    private int workingHours;
    private int rate;
    private String socialSecurityNumber;

    public SalariedEmployee(String name, String employeeId, int workingHours, int rate) {
        super(name, employeeId);
        this.workingHours = workingHours;
        this.rate = rate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public int calculatePay() {
        int salary = getWorkingHours() * getRate();
        setSalary(salary);
        return salary;
    }

}
