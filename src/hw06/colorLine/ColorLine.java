package hw06.colorLine;

public class ColorLine extends Line {
    String color;

    public ColorLine(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return String.format("Color line {color = '%s'}", color);
    }
}
