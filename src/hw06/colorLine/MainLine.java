package hw06.colorLine;

public class MainLine {
    public static void main(String[] args) {
//        Line[] lines = new Line[2];
//        lines[0] = new Line();
//        lines[1] = new ColorLine("Red");
        Line[] lines = {new Line(), new ColorLine("White")};
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }
}
