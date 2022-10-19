package hw1;

public abstract class Bird {

    private String feathers;
    private boolean layEggs;
    abstract void fly();

    @Override
    public String toString(){
        return "Bird: "+ "feathers - "+feathers + "\n layEggs - " + layEggs;
    }


}
