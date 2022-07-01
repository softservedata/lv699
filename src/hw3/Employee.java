package hw3;

public class Employee {
	
	private static double totalSum = 0;
	private final double BONUS = 0.1;	
	private String name;
	private int rate;
	private int hours;
	private int bonuses;
	private int salary;
	private int changeRate;

	
	
		
		public Employee(String name, int rate, int hours, int bonuses) {
		name = "";
		rate = 0;
		hours = 0;
		salary = 0;
	}
		public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	
	int getRate() {
		return rate;
	}
	
		void setRate(int rate) {
		this.rate = rate;
	}
		
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	int getSalary() {
		int salary = getRate() * getHours();
		totalSum = totalSum + salary;
		return salary ;
	}
	
	public void changeRate(int rate) {
		if (salary>0) {
			totalSum = totalSum - salary;
			salary = 0;
		}
		setRate(rate);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	
	


	
	double getBonuses() {
		return getSalary() * BONUS;
	}

	int getChangeRate() {
		
		
		return changeRate;
	}

	void setChangeRate(int rate) {
		this.changeRate = changeRate;
	}
	public static double getTotalSum() {
		return totalSum;
	}
	
	

}
