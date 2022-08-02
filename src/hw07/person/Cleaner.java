package hw07.person;

public class Cleaner extends Staff {
    private final String TYPE_PERSONAL;

    public Cleaner(String name, int salary) {
        super(name, salary);
        TYPE_PERSONAL = "Cleaner";
    }

    public String getTYPE_PERSONAL() {
        return TYPE_PERSONAL;
    }

    @Override
    String print() {
        return String.format("I am a %s, my name is %s%s", getTYPE_PERSONAL(), getName(), salary());
    }

    @Override
    String salary() {
        return String.format(", receive a salary: %s", getSalary());
    }
}
