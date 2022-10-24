package hw2;

public class Developer extends Employee{
    /*private String name = "Taras";
    private int age = 32;
    private double salary = 32735.35;*/
    private String position = "Average Java developer";

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f., Position: %s", getName(), getAge(), getSalary(), position);

    }
}
