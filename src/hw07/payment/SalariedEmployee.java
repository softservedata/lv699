package hw07.payment;

public class SalariedEmployee extends Employee implements Payment {
    private final int socialSecurityNumber;
    private final int hourlyPaid;
    private final int quantityHoursWorked;

    public SalariedEmployee(int ssn, String name, int hourlyPaid, int quantity) {
        super(name);
        this.socialSecurityNumber = ssn;
        this.hourlyPaid = hourlyPaid;
        this.quantityHoursWorked = quantity;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getHourlyPaid() {
        return hourlyPaid;
    }

    public int getQuantityHoursWorked() {
        return quantityHoursWorked;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Social Security: %s, Name: %s, Hourly labor price $: %s, " +
                        "Number of hours worked: %s, The average monthly salary $: %s", getEmployeeId(), getSocialSecurityNumber(),
                getName(), getHourlyPaid(), getQuantityHoursWorked(), calculatePay());
    }

    @Override
    public int calculatePay() {
        return getHourlyPaid() * getQuantityHoursWorked();
    }
}
