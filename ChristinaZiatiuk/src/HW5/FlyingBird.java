package HW5;

public class FlyingBird extends Bird{
    public  FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly");
    }
    public void showInformation(){};


}
