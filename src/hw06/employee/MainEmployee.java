package hw06.employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jerry",19,8020.68),
                new Employee("Tom",22,5523.33),
                new Developer("Mary",20,10510.042,12)};
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].report());
        }
    }
}
