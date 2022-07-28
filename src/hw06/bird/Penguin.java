package hw06.bird;

public class Penguin extends NonFlyingBird{

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin has " + feathers + " feathers and " + ((layEggs) ? "" : "not ") + "laying eggs";
    }
}
