package hw03;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    public static int totalSum;

    public static void main(String[] args) {
        Employee employee01 = new Employee("Tom", 2, 6);
        Employee employee02 = new Employee("Jerry", 8, 20);
        Employee employee03 = new Employee("Diana", 4, 8);

        System.out.println(employee01.toString());
        System.out.println(employee02.toString());
        System.out.println(employee03.toString());

        Employee.totalSum = employee01.getSalary(employee01.rate, employee01.hours) +
                employee02.getSalary(employee02.rate, employee02.hours) +
                employee03.getSalary(employee03.rate, employee03.hours);
        System.out.printf("Total Salary of all employees: %s", Employee.totalSum);
    }

    public Employee() {
        name = "Tom";
        rate = 4;
        hours = 8;
    }
    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getSalary(int rate, int hours) {
        return rate * hours;
    }

    public double getBonuses() {
        return  (double) getSalary(rate, hours) * 10 /100;
    }

    public int changeRate(int newRate) {
        setRate(newRate);
        getSalary(rate, hours);
        return newRate;
    }

    public String toString() {
        return "Employee name: " + name + "\nRate: " + rate + "\nHours: " + hours + "\nSalary: " +
               getSalary(rate, hours) + "\nBonuses 10%: " + getBonuses() + "\n";
    }
}
