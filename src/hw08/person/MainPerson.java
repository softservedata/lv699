package hw08.person;

public class MainPerson {
    public static void main(String[] args) {
        Person[] peoples = {
                new Employee("Tyson", "Tom", 32, 1000101, true),
                new Employee("Douglas", "Jerry", 29, 1000102, false),
                new Student("Lopez", "Mia", 18, 12),
                new Student("Cruise", "Lucas", 20, 71),
        };

        for (Person people : peoples) {
            System.out.println(people.info());
            System.out.println(people.activity());
        }
    }
}
