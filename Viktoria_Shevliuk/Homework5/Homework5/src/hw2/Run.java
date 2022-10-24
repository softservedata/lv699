package hw2;

public class Run {
    public static void main(String[] args) {

        Employee employee = new Employee("Josh", 34, 46675.45);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());

    }
}
