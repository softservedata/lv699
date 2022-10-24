package hw1;

public class Swallow extends FlyingBird{
    private boolean feathers = true;
    private boolean layEggs = true;
    @Override
    public String toString() {
        return "Swallow{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
