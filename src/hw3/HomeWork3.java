package hw3;

import java.util.Set;

public class HomeWork3 {

	public static void main(String[] args) {
	
		Employee Ivan = new Employee ("Ivan Ivanovuch", 100, 1);
		Employee Vasul = new Employee ("Vasul Vasuliovuch", 200, 1);
		Employee Hanna = new Employee ("Hanna Yuriivna", 300, 1);
		
		System.out.println(Ivan);
		System.out.println(Vasul);
		System.out.println(Hanna);
		
		Ivan.setRate(100);
		Vasul.setRate(200);
		Hanna.setRate(400);
	
		Ivan.setHours(2);
		Vasul.setHours(2);
		Hanna.setHours(1);
		
	System.out.println("Зарплатня Івана " + Ivan.getSalary() + ";");
	System.out.println("Зарплатня Василя " + Vasul.getSalary() + ";");
	System.out.println("Зарплатня Ганни " + Hanna.getSalary() + ";");
	Ivan.changeRate(70);
	System.out.println("Оновленна зарплатня Івана " + Ivan.getSalary() + ";");
	System.out.println("Загальна зарплатня трьох складає " + Employee.getTotalSum());
	
	}
}
