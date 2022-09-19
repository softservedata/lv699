package com.softserve.hw11.refactorHW03;

import com.softserve.hw11.refactorHW03.InvalidNumberException;

public class Employee {
    private final double BONUS = 0.1;
    private static double totalSum = 0;
    private double salary;
    private String name;
    private double rate;
    private double hours;

    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
        salary = 0;
    }
    private double wrongRate(double rate) throws InvalidNumberException{
	     if(rate<0){
	       throw new InvalidNumberException("rate must be bigger than 0");
	      }
	     else return rate;
	   }
    private double wrongHours(double hours) throws InvalidNumberException{
	     if(hours<0){
	       throw new InvalidNumberException("hours must be bigger than 0");
	      }
	     else return hours;
	   }


    public Employee(String name, double rate) {
        this.name = name;
        this.rate = wrongRate(rate);
        hours = 0;
        salary = 0;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = wrongRate(rate);
        this.hours = wrongHours(hours);
        salary = 0;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name= " + name +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    // ----------

    public double getSalary() {
        if (salary == 0) {
            salary = getRate() * getHours();
            totalSum = totalSum + salary;
        }
        return salary;
    }

    public void changeRate(int rate) {
        if (salary > 0) {
            totalSum = totalSum - salary;
            salary = 0;
        }
        setRate(rate);
        getSalary();
    }

    public double getBonuses() {
        return BONUS * getSalary();
    }


}
