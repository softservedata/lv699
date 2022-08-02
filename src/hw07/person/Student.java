package hw07.person;

public class Student extends Person {
    private final String TYPE_PERSONAL;

    public Student(String name) {
        super(name);
        TYPE_PERSONAL = "Student";
    }

    public String getTYPE_PERSONAL() {
        return TYPE_PERSONAL;
    }

    @Override
    String print() {
        return String.format("I am a %s, my name is %s", getTYPE_PERSONAL(), getName());
    }
}
