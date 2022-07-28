package hw06.bird;

public abstract class Bird {
    String feathers;
    boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract String fly();

}
