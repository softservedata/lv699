package hw1;

public class NonFlyingBird extends Bird{

    public boolean fly(){return false;}
    @Override
    public String toString() {
        return "FlyingBird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
