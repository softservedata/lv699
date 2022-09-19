package com.softserve.hw05.practical_tasks.second;

public class Employee {
    @Override
	public String toString() {
		return "\nName= " + name + ", Departmentnumber= " + departmentnumber + ", Salary= " + salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentnumber() {
		return departmentnumber;
	}
	public void setDepartmentnumber(int departmentnumber) {
		this.departmentnumber = departmentnumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private String name;
    private int departmentnumber;
    private int salary;
    public Employee() {
		name ="";
		departmentnumber =0;
		salary =0;
	}
	public Employee(String name, int departmentnumber, int salary) {
		this.name = name;
		this.departmentnumber = departmentnumber;
		this.salary = salary;
		
	}
	
//	//all employees of a certain department (enter department number in the console);
//	public static Employee department(Employee employee,int number) {
//		Employee emp=null;
//		if(employee.getDepartmentnumber()==number) {
//			emp=employee;
//			//return emp;
//		}
//		//else return null;
//	}
	//arrange workers by the field salary in descending order.
	public static Employee[] sort(Employee[]employee) {
		Employee tmp;
		for (int i = 0; i < employee.length - 1; i++) {
			for (int j = i + 1; j < employee.length; j++) {
				if (employee[i].getSalary() < employee[j].getSalary()) {
					tmp = employee[i];
					employee[i] = employee[j];
					employee[j] = tmp;
				}
			}
		}

		
		return employee;
	}
	
	
}
