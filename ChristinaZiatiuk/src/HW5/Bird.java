package HW5;

public abstract class Bird {
   private boolean feathers;
   private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs ) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public abstract void fly();

    public abstract void showInformation();

}
