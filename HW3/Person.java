package com.softserve.hometasks.hometask1.HW3;
import java.util.Scanner;


public class Person {
 private String name;
 private String lastname;
 private int BirthYear;

 public String getname() {
  return name;
 }

 public String getlastname() {

  return lastname;
 }

 public void getBirthYear( int i) {
 }

 public Person() {

 }

 public Person(String name, String lastname) {
  this.name = name;
  this.lastname = lastname;

 }

 public int getAge(int BirthYear) {
  int Age = 2022-BirthYear;
  return Age;
 }

 public void output(Person Q) {

  System.out.println("Name and Lastname is, " + name + ", " + lastname + ", "+ this.getAge(this.BirthYear));
 }

 public void input() {
  Scanner inputscan = new Scanner(System.in);
  System.out.println("Input the data: name, lastname, BirthYear ");
  this.name = inputscan.nextLine();
  this.lastname = inputscan.nextLine();
  this.BirthYear = Integer.parseInt(inputscan.nextLine());
 }

 public void cheangename(String fn, String ln) {

  System.out.println("name before changingname = " + name + ". " + "lastname before changingName = " + lastname + ".");
  lastname = ln;
  name = fn;
  System.out.println(" name AFTER Changing = " + name + ". " + "lastname AFTER Changing = " + lastname + ".   ");
 }

 public static void main(String[] args) {
  Person person1 = new Person ("Mari", "Jin");
  Person person2 = new Person ("Lee","Boo");
  Person person3 = new Person ();
  System.out.println("");

  person1.getBirthYear(1998);
  person2.getBirthYear(1992);
  person3.input();

  person1.getAge(1998);
  person2.getAge(1992);
  person3.getAge(1335);
  System.out.println("Method getAge was running");
  System.out.println("");

  person1.output(person1);
  person2.output(person1);
  person3.output(person1);
  System.out.println("Method output was running");
  System.out.println("");


 }

 }





