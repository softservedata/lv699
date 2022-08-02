package hw07.person;

abstract class Staff extends Person {
    private final int salary;

    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    abstract String salary();
}
