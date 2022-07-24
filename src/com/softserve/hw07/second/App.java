package com.softserve.hw07.second;

import com.softserve.hw07.first.ContractEmployee;
import com.softserve.hw07.first.Employee;
import com.softserve.hw07.first.SalariedEmployee;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Passengers> employees = new ArrayList<>();
        employees.add(new Boat());
        employees.add(new Bus());
        employees.add(new Car());
        employees.add(new Helicopter());
        employees.add(new Liner());
        employees.add(new Motorcycle());
        employees.add(new Plane());
        for (Passengers employee : employees) {
            if (employee instanceof Boat) {
                ((Boat) employee).isSailing();
            } else if (employee instanceof Liner) {
                ((Liner) employee).isSailing();
            } else if (employee instanceof Bus) {
                ((Bus) employee).drive();
            } else if (employee instanceof Car) {
                ((Car) employee).drive();
            } else if (employee instanceof Motorcycle) {
                ((Motorcycle) employee).drive();
            } else if (employee instanceof Helicopter) {
                ((Helicopter) employee).land();
                ((Helicopter) employee).fly();
            } else if (employee instanceof Plane) {
                ((Plane) employee).land();
                ((Plane) employee).fly();
            }
        }
    }
}
