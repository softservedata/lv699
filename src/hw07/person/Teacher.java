package hw07.person;

import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;

public class Teacher extends Staff {
    private final String TYPE_PERSONAL;

    public Teacher(String name, int salary) {
        super(name, salary);
        TYPE_PERSONAL = "Teacher";
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
