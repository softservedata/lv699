package hw06.colorLine;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Point {x = %s, y = %s}", x, y);
    }
}
