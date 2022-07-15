package HW5;

public class Chicken extends NonFlyingBird{
    public Chicken() {
        super(false, true);
    }
    public void showInformation() {
        System.out.println("Chicken");
    }
    @Override
    public void fly() {
        super.fly();
    }
}
