package hw1;

public class Eagle extends FlyingBird{
    private boolean feathers = true;
    private boolean layEggs = true;
    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
