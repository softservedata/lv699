package com.softserve.homework.task7;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class Add {


    public static void main(String[] args) {

        SalariedEmployee[] salariedEmployees = new SalariedEmployee[2];
        salariedEmployees[0] = new SalariedEmployee("Ivan", 1221353460, 42);
        salariedEmployees[1] = new SalariedEmployee("Petro", 1215450026, 30);


        for(SalariedEmployee pay:salariedEmployees) {
            double salary = pay.calculatePay();
        }

        Arrays.sort(salariedEmployees,new Employee.BySalary());

        System.out.println(Arrays.toString(salariedEmployees));

    List<ContractEmployee>contractEmployees=new ArrayList<>();
      contractEmployees.add(new ContractEmployee("Evgeniy",1018256078));
     contractEmployees.add(new ContractEmployee("Taras",1561056738));

     for (ContractEmployee pay:contractEmployees){
         double salary= pay.calculatePay();
     }

       Collections.sort(contractEmployees, new Employee.BySalary());

        System.out.println(contractEmployees.toString());
    }


    }
