package hw09;

import java.util.*;

public class Student {
    private String name;
    private int course;

    public static List<Student> studentsList = new LinkedList<>();

    public static void main(String[] args) {
        Student stObj = new Student();
        studentsList.add(new Student("Tom", 8));
        studentsList.add(new Student("Jerry", 2));
        studentsList.add(new Student("Bill", 8));
        studentsList.add(new Student("Ava", 6));
        studentsList.add(new Student("Garry", 2));
        studentsList.add(new Student("Lisa", 1));
        studentsList.add(new Student("David", 10));

        stObj.printStudentsByCourse(studentsList, 8);

        stObj.printStudent(stObj.sortStudentsByName(studentsList));
        stObj.printStudent(stObj.sortStudentsByCourse(studentsList));
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        if (course != other.getCourse() || (name == null && other.getName() != null)) return false;
        return getName().equals(other.getName());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + getCourse();

        return result;
    }

    public List<Student> sortStudentsByName(List<Student> _students) {
        System.out.println("\nSorting students by name:");
        _students.sort(new NameComparator());
        return _students;
    }

    public List<Student> sortStudentsByCourse(List<Student> _students) {
        System.out.println("\nSorting students by course:");
        _students.sort(new CourseComparator());
        return _students;
    }

    public static class CourseComparator extends Student implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.course - o2.course;
        }
    }

    public static class NameComparator extends Student implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public void printStudent(List<Student> _students) {

        for (Student student : _students) {
            System.out.println(student);
        }
    }

    public void printStudentsByCourse(List<Student> _students, int _course) {
        System.out.println("Printing students by course #" + _course + ":");
        Iterator<Student> iterator = _students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == _course) {
                System.out.println(student);
            }
        }
    }
}
