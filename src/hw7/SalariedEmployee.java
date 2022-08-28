package hw7;

public class SalariedEmployee extends Employee implements Payment {

	private int socialSecurityNumber;
	private int HourlyRate;
	private int averageMonthly;

	public SalariedEmployee(String name, int socialSecurityNumber, int averageMonthly) {
		super( name );
		this.socialSecurityNumber = socialSecurityNumber;
		this.averageMonthly = averageMonthly;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@Override
	public void calculatePay() {

	}

	public int SalaryAverageMonthly() {
		averageMonthly = HourlyRate * getNumberOfHoursWorked();
		return averageMonthly;
	}

	@Override
	public String toString() {
		return "\nSalariedEmployee -" + getName() +", " + " socialSecurityNumber=" + socialSecurityNumber + ", averageMonthly=" + averageMonthly;
	}

}
