package hw06.employee;

public class Developer extends Employee {
    private int level;

    public Developer(String name, int age, double salary, int level) {
        super(name, age, salary);
        this.level = level;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %s, Salary: %s, Level: %s", getName(), getAge(), getSalary(), level);
    }
}
