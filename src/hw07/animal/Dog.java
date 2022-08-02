package hw07.animal;

public class Dog implements Animal {
    private final String name;
    private final String whatEats;
    private final String says;

    public Dog(String name, String whatEats, String says) {
        this.name = name;
        this.whatEats = whatEats;
        this.says = says;
    }

    public String getName() {
        return name;
    }

    public String getWhatEats() {
        return whatEats;
    }

    public String getSays() {
        return says;
    }

    @Override
    public void voice() {
        System.out.printf("%s says -> %s. I want %s.\n", getName(), getSays(), getWhatEats());
    }

    @Override
    public void feed() {
        System.out.printf("A dog named %s eats a %s\n", getName(), getWhatEats());
    }
}
