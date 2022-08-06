package hw6_employee;

public class Main {

	public static void main(String[] args) {
		Employee Ingenier = new Employee("Hanna", 35, "Ingenier", 120000);
		Developer Trainee = new Developer("Kelvin", 24, "Trainee", 25000);

		System.out.println(Ingenier.report());
		System.out.println(Trainee.report());
	}
}
