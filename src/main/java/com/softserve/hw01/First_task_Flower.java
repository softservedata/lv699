package com.softserve.hw01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.lang.String;
public class First_task_Flower {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Hello. Enter please radius?");
    int radius = Integer.parseInt(br.readLine());
System.out.println("Perimeter="+(2*3.14*radius));
System.out.println("Area="+(3.14*radius*radius));
  }
}
