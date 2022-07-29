package hw06.bird;

public class MainBird {
    public static void main(String[] args) {

        Bird[] birds = {
                new Swallow("long white", true),
                new Eagle("long black", false),
                new Penguin("black and white", true),
                new Chicken("colorful short", true)
        };

        for (int i = 0; i < birds.length; i++) {
            System.out.printf("%s\n%s\n", birds[i], birds[i].fly());
        }
    }
}
