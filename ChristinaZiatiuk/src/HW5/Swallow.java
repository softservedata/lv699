package HW5;

public class Swallow extends FlyingBird{

    public Swallow () {
        super(true, true);;
    }
    public void showInformation() {
        System.out.println("Swallow");
    }
    @Override
    public void fly() {
        super.fly();
    }
}
