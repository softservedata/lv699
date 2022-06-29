package hw03;

public class Student {
    private String name;
    private int rating;
    public static double avgRating;
    public static int totalRating;

    public static void main(String[] args) {
        Student student01 = new Student();
        student01.setName("Tom");
        student01.setRating(4);
        Student student02 = new Student("Jerry", 6);
        Student student03 = new Student("Mary", 10);
        System.out.printf("%s\n%s\n%s", student01, student02, student03);

        totalRating = student01.getRating(student01.rating) +
                student02.getRating(student02.rating) +
                student03.getRating(student03.rating);

        Student.avgRating = (double) totalRating / 3;
        System.out.printf("\nAverage rating: %s, Total rating: %s", Student.avgRating, totalRating);
    }

    public Student() {
        this.name = "Tom";
        this.rating = 4;
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating(int rating) {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean betterStudent(Student first, Student second) {
        return first.rating > second.rating;
    }

    @Override
    public String toString() {
        return "Student name: " + name + ", Rating: " + rating;
    }
}
