package homework3_1;
//read 3 float numbers and check: are they all belong to the range [-5,5];
import pract_task_4.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("\n\t FIRST SUBTASK");
        System.out.println("*************************************************************\n");
        List<RangeCheck> list = new ArrayList<RangeCheck>();

        list.add(new RangeCheck(2.3f));
        list.add(new RangeCheck(65.788f));
        list.add(new RangeCheck(12.2f));
        int counter = 0;

            for (RangeCheck fl0 : list){
                if(fl0.getFl() >= -5.0f && fl0.getFl() <=5.0f){
                    System.out.println(fl0.getFl() + "  belongs to the range [-5,5]");
                    counter++;
                } else System.out.println(fl0.getFl() + "  doesn't belong to the range [-5,5]");
            }
        System.out.println(" \n\tCONCLUSION:\t ");

         if(counter == 3){
             System.out.println("\n All the numbers belong to the needed range");
         } else System.out.println("\n Not all the numbers belong to the needed range");
        System.out.println("\n*************************************************************\n");
}}
