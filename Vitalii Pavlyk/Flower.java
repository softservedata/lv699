package com.softserve.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Flower {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Hello. Enter please radius?");
    int radius = Integer.parseInt(br.readLine());
System.out.println("Perimeter="+(2*3.14*radius));
System.out.println("Area="+(3.14*radius*radius));
System.out.println("What is youre name?");
String name = br.readLine();
System.out.println("Where are you live, " + name + "?");
String address = br.readLine();
System.out.println("You are " + name + " from " + address);
  }
}
