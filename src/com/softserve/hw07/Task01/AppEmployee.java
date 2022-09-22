package com.softserve.hw07.Task01;

import java.util.Arrays;

public class AppEmployee {
    public static void main(String[] args) {
        SalariedEmployee s1 =  new SalariedEmployee("Andrew", 109, 160,"EX201578");
        SalariedEmployee s2 =  new SalariedEmployee("Tanya", 111, 158,"EX207978");
        ContractEmployee c1 = new ContractEmployee("Oleg", 24000, 178645914);
        ContractEmployee c2 = new ContractEmployee("Max", 22500, 198644214);

        Employee [] employees = {s1,s2,c1,c2};
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees,new Employee.SalaryCmpr());

        System.out.println(Arrays.toString(employees));


    }
}
