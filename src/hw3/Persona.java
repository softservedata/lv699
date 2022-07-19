package hw3;

import java.util.Scanner;

public class Persona {
	
	private String firstName;
	private String lastName;
	private int NewYear;
	private int vik;
	private String newName;
	


	@Override
	public String toString() {
		return "Persona [firstName=" + firstName + ", lastName=" + lastName + ", vik="
				+ vik + ", newName=" + newName + "]";
	}
	
	public Persona(String firstName, String lastName, int vik, String newName) {
		firstName = " ";
		lastName = " ";
		vik = 0;
		newName = " ";
	}

	public Persona(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.newName = newName;
		
	}
	
	public int getNewYear() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Введіть рік народження: ");
		vik = 2022 - reader.nextInt();
		System.out.println("Вам зараз " + vik + " років");
		return vik;
	}
	

	public String getnewName() {
		Scanner firstNameScan = new Scanner(System.in);
		System.out.println(Persona.this.firstName + " введіть нове імя: \n");
		String newName = firstNameScan.nextLine();
		return newName;
	}
	
	public void setNewName(String newName) {
		this.newName = newName;
	}

		

	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
