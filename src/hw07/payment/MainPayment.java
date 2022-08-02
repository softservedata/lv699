package hw07.payment;

import java.util.Arrays;
import java.util.Comparator;

public class MainPayment {
    public static void main(String[] args) {

        Employee[] employees = {
                new SalariedEmployee(1000101002, "Tom", 12, 24),
                new SalariedEmployee(1000101001, "Jerry", 8, 30),
                new SalariedEmployee(1000101003, "Max", 40, 12),
                new ContractEmployee(100101001, "Antonina ", 820),
                new ContractEmployee(100101003, "James ", 2100),
                new ContractEmployee(100101002, "Mary ", 1100)
        };

        int id = 0;
        System.out.println("Before:");
        for (Employee employee : employees) {
            id++;
            employee.setEmployeeId(id); //Creates ID for employee
            System.out.println(employee);
        }
        // Example sort I
        System.out.println("Example sort I");
        System.out.println("After sort:");
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.calculatePay() - o2.calculatePay());
            }
        });
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        // Example sort II
        System.out.println("Example sort II");
        Arrays.sort(employees, Comparator.comparingInt(Employee::calculatePay));
        System.out.println("After sort:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
