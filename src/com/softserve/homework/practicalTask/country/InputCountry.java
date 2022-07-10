package com.softserve.homework.practicalTask.country;

import java.util.Scanner;

public class InputCountry {
    Scanner scanner=new Scanner(System.in);
    public String getCountry(){
        String country;
        System.out.println("Enter country:");
         country=scanner.nextLine();
         return country;
    }

}
