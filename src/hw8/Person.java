package hw8;

public abstract class Person {

	private int age;
	private FullName fullName;

	public Person(String firstName, String lastName, int age) {
		this.fullName = new FullName(firstName, lastName);
		this.age = age;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String info() {
		return "Hi, my name is " + fullName.getFirstName() + " " + fullName.getLastName() + ", I am " + age + " years old.";
	}

	public abstract String activity();

}
