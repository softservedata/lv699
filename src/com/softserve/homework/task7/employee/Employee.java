package com.softserve.homework.task7.employee;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

   public  static  class BySalary implements Comparator<Employee> {
      @Override
      public int compare(Employee employee1, Employee employee2){
         return (int) (employee1.getMonthSalary() - employee2.getMonthSalary()) ;
      }
   }



   private String name;
   private double monthSalary;
   private int id;


   public Employee() {
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getMonthSalary() {
      return monthSalary;
   }

   public void setMonthSalary(double monthSalary) {
      this.monthSalary = monthSalary;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   @Override
   public int compareTo(Employee employee) {
      //return name.compareTo(employee.getName());
      return (int) (- monthSalary+employee.getMonthSalary());
   }
}
