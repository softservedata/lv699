package com.softserve.hw01;

import java.util.Scanner;

public class Phonecalls {

    public static void main (String[] args) {

           //task3

        double c1,c2,c3, t1,t2, t3;
        System.out.println("Please input c1 standart unit per minute");
        Scanner scan = new Scanner(System.in);
        c1 = scan.nextDouble();

        System.out.println("Please input c2 standart unit per minute");
        c2 = scan.nextDouble();
        System.out.println("Please input c3 standart unit per minute");
        c3 = scan.nextDouble();
        System.out.println("How much time do you need for first call(t1)");
        t1 = scan.nextDouble();
        System.out.println("How much time do you need for first call(t2)");
        t2 = scan.nextDouble();
        System.out.println("How much time do you need for first call(t3)");
        t3 = scan.nextDouble();


        double rez1, rez2, rez3, rez;
        rez1=c1*t1;
        rez2=c2*t2;
        rez3=c3*t3;
        rez=rez1+rez2+rez3;

        System.out.println("First call worth: "+c1+"$ per minute"+ "In was continued: "+ t1 +"."+ "It was worth: " + rez1+"$");
        System.out.println("Second call worth: "+c2+"$ per minute"+ "In was continued: "+ t2 +"."+ "It was worth: " + rez2+"$");
        System.out.println("First call worth: "+c3+"$ per minute"+ "In was continued: "+ t3 +"."+ "It was worth: " + rez3+"$");

        System.out.println("All three calls was worth: "+ rez);

    }

}
