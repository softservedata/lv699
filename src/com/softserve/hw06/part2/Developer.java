package com.softserve.hw06.part2;

public class Developer extends Employee {
    private String position;



    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }
    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: \u20B4 %.2f",
                getName(), getAge(), position, getSalary());
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Will Smith", 50, 25000.55);
        Developer dev = new Developer("Anna", 25 , 10000.80, "junior java developer");

        System.out.println(emp.report());
        System.out.println(dev.report());

    }

}
