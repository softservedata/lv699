package com.softserve.homework.task1.phoneCalls;

import java.util.Scanner;

public class PhoneCalls {
    public static void main(String[] args) {
        double c1;
        double c2;
        double c3;
        int t1;
        int t2;
        int t3;
        double sumAll;
        double sum1;
        double sum2;
        double sum3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas,enter the cost of one minute c1 in the format for example 1,2: ");
        c1 = scanner.nextDouble();
        System.out.println("Pleas,enter the timing t1 (in whole number): ");
        t1 = scanner.nextInt();
        System.out.println("Pleas,enter the cost of one minute c2 in the format for example 1,2: ");
        c2 = scanner.nextDouble();
        System.out.println("Pleas,enter the timing t2 (in whole number): ");
        t2 = scanner.nextInt();
        System.out.println("Pleas,enter the cost of one minute c3 in the format for example 1,2: ");
        c3 = scanner.nextDouble();
        System.out.println("Pleas,enter the timing t3 (in whole number) : ");
        t3 = scanner.nextInt();
        System.out.println("You enter c1: " + c1 +"y.e.;"+ "\n" + "t1: " + t1 + ";");
        System.out.println("You enter c2: " + c2 +"y.e.;"+ "\n" + "t2: " + t2 + ";");
        System.out.println("You enter c3: " + c3 +"y.e.;"+ "\n" + "t3: " + t3 + ";");
        PhoneCalls phoneCalls1=new PhoneCalls();
        PhoneCalls phoneCalls2=new PhoneCalls();
        PhoneCalls phoneCalls3=new PhoneCalls();

        sum1=phoneCalls1.count(c1,t1);
        sum2=phoneCalls2.count(c2,t2);
        sum3=phoneCalls3.count(c3,t3);
        sumAll=sum1+sum2+sum3;
        System.out.println("The cost of your call 1 is :"+sum1);
        System.out.println("The cost of your call 2 is :"+sum2);
        System.out.println("The cost of your call 3 is :"+sum3);
        System.out.println("The cost of all calls are :"+sumAll);
    }

    public  double count(double c, int t) {
        double count=c*t;
        return count;

    }

}