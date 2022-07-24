package com.softserve.hw07;

import java.util.Objects;

public class ContractEmployee extends Employee implements Comparable<ContractEmployee>,Payment {
    private String federalTaxIdmember;
    private int fixed_monthly_payment;

    public ContractEmployee() {
        super();
        fixed_monthly_payment=0;
        federalTaxIdmember="";
    }

    public ContractEmployee(String employeeId,String Name,String federalTaxIdmember, int fixed_monthly_payment) {
        super(employeeId,Name);
        this.fixed_monthly_payment = fixed_monthly_payment;
        this.federalTaxIdmember=federalTaxIdmember;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getFixed_monthly_payment() {
        return fixed_monthly_payment;
    }

    public void setFixed_monthly_payment(int fixed_monthly_payment) {
        this.fixed_monthly_payment = fixed_monthly_payment;
    }

    @Override
    public String toString() {
        return super.toString() +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", fixed_monthly_payment=" + fixed_monthly_payment +
                '}';
    }

    @Override
    public int calculatePay() {
        int salary=0;
        salary = this.fixed_monthly_payment;
        return salary;
    }

    @Override
    public int compareTo(ContractEmployee employee) {
        return this.getName().compareTo(employee.getName());
    }
}
