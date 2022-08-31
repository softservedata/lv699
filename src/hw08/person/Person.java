package hw08.person;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person() {
        this.age = 100;
        fullName = new FullName();
    }

    public Person(String _firstName, String _lastName, int _age) {
        this();
        fullName.firsName = _firstName;
        fullName.lastName = _lastName;
        this.age = _age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return getFullName() + ", age: " + getAge();
    }

// Abstract Method
    abstract public String activity();

// Inner Class
    public class FullName {
        private String firsName;
        private String lastName;

        public FullName() {
            this.firsName = "";
            this.lastName = "";
        }

        public FullName(String _firsName, String _lastName) {
            this.firsName = _firsName;
            this.lastName = _lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "FullName{" +
                    "firsName='" + firsName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}
