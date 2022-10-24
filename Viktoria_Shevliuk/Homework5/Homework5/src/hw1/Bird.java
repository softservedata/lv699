package hw1;

public abstract class Bird {

    boolean feathers;
    boolean layEggs;
    abstract boolean fly();

    @Override
    public String toString(){
        return "Bird: "+ "feathers - "+feathers + "\n layEggs - " + layEggs;
    }


}
