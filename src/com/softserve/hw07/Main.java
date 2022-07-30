package com.softserve.hw07;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        Employee[] employeeld = new Employee [8];
        employeeld[0] = new SalariedEmployee("Jake", 13000, "0AZero");
        employeeld[1] = new SalariedEmployee("Volodymyr", 7500, "1AOne");
        employeeld[2] = new SalariedEmployee("Lilia", 25000, "2ATwo");
        employeeld[3] = new SalariedEmployee("Andrii", 9000, "3AThree");
        employeeld[4] = new ContractEmployee("Yulia", 25.3, 200, 4444);
        employeeld[5] = new ContractEmployee("Kira", 19.50, 168, 5555);
        employeeld[6] = new ContractEmployee("Ira", 33.10, 187, 6666);
        employeeld[7] = new ContractEmployee("Nazar", 45.00, 196, 7777);

       for ( int i = 0; i< employeeld.length; i++) {
           employeeld[i].calculatePay();
       }
        System.out.println("Array is not sorted yet");
       System.out.println(Arrays.toString(employeeld));

       System.out.println("Array is Sorted");
       Arrays.sort(employeeld, new Employee.ByFinalPayment());
        System.out.println(Arrays.toString(employeeld));
        }
    }









