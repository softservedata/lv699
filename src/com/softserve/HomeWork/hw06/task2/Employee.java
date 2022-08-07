package com.softserve.HomeWork.hw06.task2;

//Support we have a class Employee
//Create a Developer class that extends the Employee class. Creates a String field and a constructor to initialize all fields in the Developer class.
//
//
//Also in the Developer class, override the method report() so that it returns a string with information about the developer, for example:
//        Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
//        If necessary, modify the employee's class so that it meets the principles of encapsulation and inheritance. Create an instance of the Employee and Developer class and print in the console information about them using report() method.


public class Employee {
    private String name;
    private  int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public  String report(){
       return String.format(name, age, salary);
    }
}
