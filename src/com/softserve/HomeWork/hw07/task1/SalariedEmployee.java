package com.softserve.HomeWork.hw07.task1;
import java.util.Arrays;

public class SalariedEmployee extends Employee implements Payment {
    private int socialSecurityNumber;

    public int getMonthlySalary() {
        return monthlySalary;
    }

    private int monthlySalary;
    private int hourlyRate;
    private int numberOfHours;

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String employeeName, int socialSecurityNumber, int hourlyRate, int numberOfHours) {
        super(employeeName);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    @Override
    public int calculatePay() {

        return monthlySalary = hourlyRate * numberOfHours;

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                ", employeeName=" +employeeName +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHours=" + numberOfHours +
                ", monthlySalary=" + monthlySalary +

                '}';
    }

//
}
