package hw06.colorLine;

public class Line {
    Point pointOne = new Point(5, 2);
    Point pointTwo = new Point(1, 4);

    @Override
    public String toString() {
        return String.format("Line {One = %s, Two = %s}", pointOne, pointTwo);
    }
}
