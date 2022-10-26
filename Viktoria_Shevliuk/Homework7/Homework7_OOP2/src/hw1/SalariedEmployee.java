/*The calculation formula for the time-worker is: the average monthly
	salary = hourly rate * number of hours worked*/

package hw1;

public class SalariedEmployee  extends Employee implements Payment {
    private String socialSecurityNumber;
    private double hourlyRate;
    private double hoursWorked;

    private  double avsalary;
    SalariedEmployee( String employeeId,String name, String federalTaxIdmember, double hourlyRate, double hoursWorked ){
        super(employeeId, name);
        this.socialSecurityNumber = federalTaxIdmember;
        this.avsalary = avsalary;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }

    @Override
    public double calculatePay() {
        avsalary = hourlyRate*hoursWorked;
    return avsalary;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
