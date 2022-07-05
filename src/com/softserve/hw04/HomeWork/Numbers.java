package com.softserve.hw04.HomeWork;

import java.util.Scanner;

public class Numbers {
    public static float f1, f2, f3, c1,c2 = 0f;
    public static int count = 0;

    //read 3 float numbers and check: are they all belong to the range [-5,5];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Imput 3 Float numbers");
     float f1 = sc.nextFloat();
       float f2 = sc.nextFloat();
       float f3 = sc.nextFloat();

        float c1 = -5f;
        float c2 = 5f;

    if (f1 >= c1  && f1 <= c2 && f2 >= c1  && f2 <= c2 && f3 >= c1  && f3 <= c2) {
        System.out.println ("all numbers belong to the range [-5;5]");
    } else System.out.println ("NOT all numbers belong to the range [-5;5]");
}
    // read 3 integer numbers and write max and min of them;



}


   // read 3 integer numbers and write max and min of them;
    //read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)*/
  //  read 3 float numbers and check: are they all belong to the range [-5,5];

