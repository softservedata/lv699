package hw07.person;

public class MainPerson {
    public static void main(String[] args) {
        Person[] persons = {
                new Student("Jon"),
                new Teacher("Olga", 8500),
                new Cleaner("Bob", 6200)
        };
        // Example I
        System.out.println("Example I");
        for (Person person : persons) {
            System.out.println(person.print());
        }
        // Example II Use the "instanceof" operator to check whether the object belongs to the Class
        System.out.println("\nExample II Use the \"instanceof\" operator " +
                "to check whether the object belongs to the Class");
        for (Person person : persons) {
            if (person instanceof Student) {
                System.out.println(person.print());
            }
            if (person instanceof Staff) {
                System.out.println(person.print());
            }

        }
    }
}