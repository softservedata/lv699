package com.softserve.hw07.first;
import java.util.Comparator;
import java.io.Serializable;


public class ContractEmployee extends Employee implements Payment {
	
	public static class NameComparator implements Comparator<ContractEmployee>{
	    @Override
	    public int compare(ContractEmployee o1, ContractEmployee o2) {
	        return o1.calculatePay()-o2.calculatePay();
	    }
	}
    private int federalTaxIdmember;
    private int fixed_monthly_payment;
    private int salary;

    public ContractEmployee() {
        super();
        fixed_monthly_payment=0;
        federalTaxIdmember=0;
        salary=0;
    }

    public ContractEmployee(String employeeId,String Name,int federalTaxIdmember, int fixed_monthly_payment) {
        super(employeeId,Name);
        this.fixed_monthly_payment = fixed_monthly_payment;
        this.federalTaxIdmember=federalTaxIdmember;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
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
        salary = this.fixed_monthly_payment;
        return salary;
    }
   

}
