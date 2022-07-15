package HW5;

public class Penguin extends NonFlyingBird{
    public Penguin() {
        super(false, true);
    }
    public void showInformation() {
        System.out.println("Penguin");
    }
    @Override
    public void fly() {
        super.fly();
    }
}
