
package hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new SalariedEmployee("id000001", "Emp1", "qw101", 45.65, 120));
        emp.add(new SalariedEmployee("id000002", "Emp2", "qw202", 34.15, 100));
        emp.add(new ContractEmployee("id000003", "Emp3", "qw303", 4050));
        emp.add(new ContractEmployee("id000004", "Emp4", "qw404", 5701));

        for (Employee e : emp) {
            if (e instanceof ContractEmployee) {
                double salary = ((ContractEmployee) e).calculatePay();
            }
            if (e instanceof SalariedEmployee) {
                double salary = ((SalariedEmployee) e).calculatePay();
            }
        }
        Collections.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) -(o1.calculatePay() - o2.calculatePay());
            }
        });


        System.out.println("Sequence of workers descending the average monthly wage: \n");
        for (Employee each : emp) {
            System.out.println("employee ID: " + each.employeeId + ", employee name: " +
                    each.name + ", average monthly wage: " +  each.calculatePay());
        }


    }


}

