package HW5;

public class Eagle extends FlyingBird{
    public Eagle() {
        super(true, true);
    }

    public void showInformation() {
        System.out.println("Eagle");
    }
    @Override
    public void fly() {
        super.fly();
    }
}
