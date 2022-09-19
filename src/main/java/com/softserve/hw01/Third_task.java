package com.softserve.hw01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.lang.String;

public class Third_task {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Hello. Enter please c1?");
    int c1 = Integer.parseInt(br.readLine());
    System.out.println("Hello. Enter please c2?");
    int c2 = Integer.parseInt(br.readLine());
    System.out.println("Hello. Enter please c3?");
    int c3 = Integer.parseInt(br.readLine());
    System.out.println("Hello. Enter please t1?");
    int t1 = Integer.parseInt(br.readLine());
    System.out.println("Hello. Enter please t2?");
    int t2 = Integer.parseInt(br.readLine());
    System.out.println("Hello. Enter please t3?");
    int t3 = Integer.parseInt(br.readLine());
System.out.println("Cost of first talk= "+(c1*t1));
System.out.println("Cost of second talk= "+(c2*t2));
System.out.println("Cost of third talk= "+(c3*t3));
System.out.println("Cost of all talks= "+((c3*t3)+(c2*t2)+(c1*t1)));
}
}