package HW5;

public class NonFlyingBird extends Bird{
    public  NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can`t fly");
    }
    public void showInformation(){};
}
