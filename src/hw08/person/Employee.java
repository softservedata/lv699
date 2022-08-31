package hw08.person;

public class Employee extends Person {
    private int idNumber;
    private boolean status;

    public Employee(String _firstName, String _lastName, int _age, int idNumber, boolean status) {
        super(_firstName, _lastName, _age);
        this.idNumber = idNumber;
        this.status = status;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String activity() {
        return "Employee: " + getFullName() + ", ID: " + getIdNumber() + ", " + (isStatus()? "working." : "does not work.");
    }
}
