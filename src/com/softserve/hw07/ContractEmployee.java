package com.softserve.hw07;

public class ContractEmployee extends Employee implements Payment {
    private int rate;
    private String federalTaxIdMember;

    public ContractEmployee(String name, String employeeId, int rate) {
        super(name, employeeId);
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public int calculatePay() {
        int salary = getRate();
        setSalary(salary);
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }
}
