package hw4;

import java.util.Objects;

public class Dog {

	private String name;
	private int age;
	Breed breed;

	public Dog(String name, int age, Breed breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public Dog() {
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + ", isTheOldest= + isTheOldest + \"]";
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

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, breed, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && breed == other.breed && Objects.equals(name, other.name);
	}
	// Method for show on display the name and the Kind of the oldest dog.
	String inAll = "";
	
	public String dogYear(Dog dog1, Dog dog2, Dog dog3) {
		int dogYear = 0;
		String isTheOldestName = "";

		if (dog1.getAge() >= dogYear) {
			dogYear = dog1.getAge();
			isTheOldestName = dog1.getName();
		}

		if (dog2.getAge() >= dogYear) {
			dogYear = dog2.getAge();
			isTheOldestName = dog2.getName();

			if (dog3.getAge() >= dogYear) {
				dogYear = dog3.getAge();
				isTheOldestName = dog3.getName();
			}
		}
		return inAll = ("\n The oldest dog is " + dogYear + " years old. It name is " + isTheOldestName + ".");
	}
}
