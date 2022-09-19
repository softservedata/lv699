package com.softserve.hw05.practical_tasks.first;

public class AppCalc {
    public static void main(String[] args) {
      Calc  calc = new Calc();
      int [] m= {2,3,4,-67,9,-10,56,34,21,-8};
        System.out.println("the biggest of these numbers = "+calc.theBiggest(m));
        System.out.println("the sum of positive numbers in the array = "+calc.sumpositive(m));
        System.out.println("the amount of negative numbers in the array = "+calc.amountofnegative(m));
        System.out.println("What values there are more: negative or positive?\n"+calc.morevalues(m));

    }
}
