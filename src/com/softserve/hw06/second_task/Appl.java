package com.softserve.hw06.second_task;

public class Appl {
    public static void main(String[] args) {
        Employee employee= new Employee("Dmytro", 23, 500);
        Employee deleloper= new Developer("Nazar", 29, 3000, "Java developer");
//    Also in the Developer class, override the method report() so that it returns a string with information about the developer,
//    for example:
//    Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
//    If necessary, modify the employee's class so that it meets the principles of encapsulation and inheritance.
//    Create an instance of the Employee and Developer class and
//        print in the console information about them using report() method.
        System.out.println(employee.report());
        System.out.println(deleloper.report());


    }
}
