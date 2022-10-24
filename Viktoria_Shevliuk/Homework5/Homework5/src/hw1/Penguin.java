package hw1;

public class Penguin extends NonFlyingBird{
    private boolean feathers = false;
    private boolean layEggs = true;
    @Override
    public String toString() {
        return "Penguin{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
