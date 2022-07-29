package hw06.bird;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "This bird can fly";
    }
}
