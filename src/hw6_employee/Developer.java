package hw6_employee;

public class Developer extends Employee {

	public Developer(String name, int age, String position, int salary) {
		super(name, age, position, salary);

	}

	@Override
	public String report() {
		return String.format("Name: %s, Age: %s; Position: %s, Salary: %s", getName(), getAge(), getPosition(),
				getSalary());
	}
}

	
	
	

