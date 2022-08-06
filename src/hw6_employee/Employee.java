package hw6_employee;

public class Employee {

	private String name;
	private int age;
	private String position;
	private int salary;
	
	public Employee(String name, int age, String position, int salary) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
	}

	public String report() {
		return String.format("Name: %s, Age: %s, position: %s, salary: %s, ", name, age, position, salary );
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	
}
