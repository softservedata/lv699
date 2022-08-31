package hw08.person;

public class Student extends Person {
    private int course;

    public Student(String _firstName, String _lastName, int _age, int course) {
        super(_firstName, _lastName, _age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info() {
        return super.info() + ", course: " + getCourse();
    }

    @Override
    public String activity() {
        return "I'm student and study at university";
    }
}
