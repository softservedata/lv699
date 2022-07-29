package hw06.bird;

public class Eagle extends FlyingBird{
    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle has " + feathers + " feathers and " + ((layEggs) ? "" : "not ") + "laying eggs";
    }
}
