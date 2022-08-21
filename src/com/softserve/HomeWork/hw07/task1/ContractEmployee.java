package com.softserve.HomeWork.hw07.task1;


public class ContractEmployee extends Employee implements Payment,Comparable<ContractEmployee> {
    private int federalTaxDismember;
    private int monthlySalary;
    private int fixedPayment;

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getFederalTaxDismember() {
        return federalTaxDismember;
    }

    public void setFederalTaxDismember(int federalTaxDismember) {
        this.federalTaxDismember = federalTaxDismember;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxDismember=" + federalTaxDismember +
                ", employeeName=" + employeeName+
                ", fixedPayment=" + fixedPayment +
                ", monthlySalary=" + monthlySalary+
                "}";

    }

    public ContractEmployee(String employeeName, int federalTaxDismember, int fixedPayment) {
        super(employeeName);
        this.federalTaxDismember = federalTaxDismember;
        this.fixedPayment = fixedPayment;

    }

    @Override
    public int calculatePay() {
        return monthlySalary = fixedPayment;
    }


    @Override
    public int compareTo(ContractEmployee employees) {
        return calculatePay() + employees.calculatePay();
    }

//    @Override
//    public int compareTo(Employee o) {
//        return 0;
//    }
//}
}