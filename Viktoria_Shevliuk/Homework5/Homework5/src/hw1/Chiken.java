package hw1;

public class Chiken extends NonFlyingBird{
    private boolean feathers = true;
    private boolean layEggs = true;
    @Override
    public String toString() {
        return "Chicken{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
