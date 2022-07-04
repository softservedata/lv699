package hw3;

public class HomeW3 {

	public static void main(String[] args) {
		System.out.println("Співробітник \n");
		Employee Ivan = new Employee("Ivan Ivanovuch", 100, 1);
		Employee Vasul = new Employee("Vasul Vasuliovuch", 200, 1);
		Employee Hanna = new Employee("Hanna Yuriivna", 300, 1);

		System.out.println("Співробітник " + Ivan);
		System.out.println("Співробітник " + Vasul);
		System.out.println("Співробітник " + Hanna);

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
		
		System.out.println("\n Person \n");
		
		Persona p1 = new Persona("Oleg", "Olegovich, 1985");
		Persona p2 = new Persona("David", "Davidivich, 1980");
		Persona p3 = new Persona("Tamir", "Tamirovich, 1975");
		Persona p4 = new Persona("Quadro", "Kopter, 1970");
		Persona p5 = new Persona("Petro", "Petrovich, 1965");
		

		System.out.println(p1);
		p1.getnewName();
		p1.getNewYear();
		System.out.println(p1);

	}

}
