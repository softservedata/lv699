package hw1;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new SalariedEmployee("id000001", "Emp1", "qw101", 45.65, 120));
        emp.add(new SalariedEmployee("id000002", "Emp2", "qw202", 34.15, 100));
        emp.add(new ContractEmployee("id000003", "Emp3", "qw303", 40000));
        emp.add(new ContractEmployee("id000004", "Emp4", "qw404", 50000));



    }
}
