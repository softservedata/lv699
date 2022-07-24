package com.softserve.hw07.first;

public class SalariedEmployee extends Employee implements Payment, Comparable<Employee>  {
   private String socialSecurityNumber;
    private int hourly_rate;
    private int  number_of_hours_worked;

    public SalariedEmployee() {
        super();
        hourly_rate=0;
        number_of_hours_worked=0;
    }

    public SalariedEmployee(String employeeId,String Name, String socialSecurityNumber, int hourly_rate, int number_of_hours_worked) {
        super(employeeId,Name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourly_rate = hourly_rate;
        this.number_of_hours_worked = number_of_hours_worked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(int hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public int getNumber_of_hours_worked() {
        return number_of_hours_worked;
    }

    public void setNumber_of_hours_worked(int number_of_hours_worked) {
        this.number_of_hours_worked = number_of_hours_worked;
    }

    @Override
    public String toString() {
        return super.toString() +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hourly_rate=" + hourly_rate +
                ", number_of_hours_worked=" + number_of_hours_worked +
                '}';
    }

    @Override
    public int calculatePay() {
        int salary=0;
        salary = hourly_rate * number_of_hours_worked;
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }


}
