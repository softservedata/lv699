package hw06.bird;

public class Swallow extends FlyingBird{

    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow has " + feathers + " feathers and " + ((layEggs) ? "" : "not ") + "laying eggs";
    }
}
