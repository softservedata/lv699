package com.softserve.hw07.Task01;

public class SalariedEmployee extends Employee implements Payment{
    private String name;
    private double hourlyRate;
    private int numberOfHoursWorked;
    private final String socialSecurityNumber;
    private double salary;

    public SalariedEmployee(String name,double hourlyRate, int hours, String socialSecurityNumber) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = hours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getNumberOfHoursWorked(){
        return numberOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        double salary = getHourlyRate() * getNumberOfHoursWorked();
        setSalary(salary);
        return getSalary();
    }


    @Override
    public String toString() {
        return getSocialSecurityNumber() + " " + getName() + " " + calculatePay();
    }

}
