package com.softserve.homework.task7;

public class ContractEmployee extends Employee implements Payment{
    protected String name;
 private final static double FIXED_PAID= 5_000.00;
 protected int federalTaxIdMember;
protected double monthSalaryFix;



    @Override
    public double calculatePay() {
        monthSalaryFix=FIXED_PAID;
        return monthSalaryFix;
    }

    public ContractEmployee(String name,int federalTaxIdMember) {
        this.name=name;
        this.federalTaxIdMember = federalTaxIdMember;

    }

    public double getMonthSalaryFix() {
        return monthSalaryFix;
    }

    public void setMonthSalaryFix(double monthSalaryFix) {
        this.monthSalaryFix = monthSalaryFix;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(int federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public String toString() {
        return "\n\tContractEmployee{" +
                " name=" + name +
                " , monthSalaryFix=" + monthSalaryFix +
                " , federalTaxIdMember=" + federalTaxIdMember +
                '}';
    }
}
