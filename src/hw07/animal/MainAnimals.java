package hw07.animal;

public class MainAnimals {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Tom","milk","meow-meow-meow"),
                new Dog("Butch", "bone", "woof-woof-woof")
        };
        for (Animal animal : animals) {
            showAnimals(animal);
        }
    }
    public static void showAnimals(Animal animals){
        animals.voice();
        animals.feed();
    }
}
