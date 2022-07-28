package hw06.bird;

public class Chicken extends NonFlyingBird {

    public Chicken(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Chicken has " + feathers + " feathers and " + ((layEggs) ? "" : "not ") + "laying eggs";
    }
}
