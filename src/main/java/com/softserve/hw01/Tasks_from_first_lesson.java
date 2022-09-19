package com.softserve.hw01;
import java.io.BufferedReader;
import java.lang.String;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class Tasks_from_first_lesson {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Hello. Enter please a?");
    int a = Integer.parseInt(br.readLine());
    System.out.println("Hello. Enter please b?");
    int b = Integer.parseInt(br.readLine());
System.out.println("a+b="+(a+b));
System.out.println("a-b="+(a-b));
System.out.println("a*b="+(a*b));
System.out.println("a/b="+(a/b));

System.out.println("How are you?");
String name = br.readLine();
System.out.println("You are " + name);
  }
}
