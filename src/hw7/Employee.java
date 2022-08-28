package hw7;

import java.util.Arrays;
import java.util.Objects;

public class Employee implements Comparable<Employee> {

	protected String employeeld;
	private int salary;
	private int numberOfHoursWorked;
	private String name;

	public Employee( String name) {
		this.name = name;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public int getSalary() {
		return salary;
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeld, name, numberOfHoursWorked, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeld, other.employeeld) && Objects.equals(name, other.name)
				&& numberOfHoursWorked == other.numberOfHoursWorked && salary == other.salary;
	}





	@Override
	public String toString() {
		return "\nEmployee [salary=" + salary + ", name=" + name + "]";
	}

	public int compareTo(Employee employee) {
		return salary;
	}



	public static void main(String[] args) {
		Employee [] employee = new Employee[6];
		employee[0] = new SalariedEmployee("Franko", 111, 700);
		employee[1] = new SalariedEmployee("Vovchok", 222, 43);
		employee[2] = new ContractEmployee("Federer", 444, 1220);
		employee[3] = new ContractEmployee("Djockovich", 555, 998);
		employee[4] = new SalariedEmployee("Stus", 333, 542);
		employee[5] = new ContractEmployee("Nadal", 666, 893);

		System.out.println("Original Array" + Arrays.toString(employee));
		Arrays.sort(employee);
		System.out.println("Sorted Array" + Arrays.toString(employee));

	}
}