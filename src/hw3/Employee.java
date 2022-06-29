package hw3;

public class Employee {
	
	private String name;
	private int rate;
	private int hours;
	static int totalSum;
	private int bonuses;
	private int salary;
	
	public Employee() {
	}
		
		public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public Employee(String name, int spped) {
		this.name = name;
		this.rate = rate;
	}
// Метод для отримання вартості оплати праці (Rate)	
	int getRate() {
		return rate;
	}
	
	void setRate(int rate) {
		this.rate = rate;
	}
// метод для отримання Hours
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
// Метод для розрахунку Salary
	int getSalary() {
		int salary = rate * hours;
		return salary ;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	public void changeRate(int rate) {
		
	}
	
	int getBonuses() {
		return bonuses;
	}
	

}
