package hw06.bird;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "This bird can not fly";
    }
}
