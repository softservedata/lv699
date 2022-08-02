package com.softserve.homework.task7;

public class SalariedEmployee extends Employee implements Payment{
protected String name;
    protected final double HOUR_PAY=10.5;
    protected int hours;
    protected double monthSalary;
    protected int socialSecurityNumber;


    public SalariedEmployee(String name, int socialSecurityNumber,int hours) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hours=hours;

           }

    @Override
    public double getMonthSalary() {
        return monthSalary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        monthSalary=(double) HOUR_PAY*hours;
        return monthSalary;
    }

    @Override
    public String toString() {
        return "\n\tSalariedEmployee{" +
                " name=" + name +
                ", hourPay=" + HOUR_PAY +
                ", hours=" + hours +
                ", monthSalary=" + monthSalary +
                ", socialSecurityNumber=" + socialSecurityNumber +
                               '}';
    }

}
