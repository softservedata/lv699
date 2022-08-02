package hw07.payment;

public class Employee implements Payment {
    private int employeeId;
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, name: %s", getEmployeeId(), getName());
    }

    @Override
    public int calculatePay() {
        return 0;
    }
}
