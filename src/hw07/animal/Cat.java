package hw07.animal;

public class Cat implements Animal {
    private final String name;
    private final String whatDrinks;
    private final String says;

    public Cat(String name, String whatDrinks, String says) {
        this.name = name;
        this.whatDrinks = whatDrinks;
        this.says = says;
    }

    public String getName() {
        return name;
    }

    public String getWhatDrinks() {
        return whatDrinks;
    }

    public String getSays() {
        return says;
    }

    @Override
    public void voice() {
        System.out.printf("%s says -> %s. I want %s.\n", getName(), getSays(), getWhatDrinks());
    }

    @Override
    public void feed() {
        System.out.printf("A cat named %s drinks %s\n", getName(), getWhatDrinks());
    }
}
