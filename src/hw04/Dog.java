package hw04;

public class Dog {

    public static void main(String[] args) {

        Dog dog01 = new Dog("Jerry", Breed.DALMATIAN, 15);
        Dog dog02 = new Dog("Tom", Breed.PUG, 10);
        Dog dog03 = new Dog("Jerry2", Breed.BEAGLE, 15);

        Dog dog = new Dog();
        dog.getOldest(dog01, dog02, dog03);

        String duplicateName = dog.isSameName(dog01, dog02, dog03);
        System.out.print((duplicateName != null) ?
                "\nDogs have the same name: " + duplicateName : "\nDogs not have the same name");
    }

    private final String name;
    private final Breed breed;
    private final int age;

    public Dog() {
        name = null;
        breed = null;
        age = 0;
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog: " + name + ", breed: " + breed.getName();
    }

    enum Breed {
        BEAGLE("Beagle"), DALMATIAN("Dalmatian"), PUG("Pug");

        private final String name;

        Breed(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public String isSameName(Dog dog01, Dog dog02, Dog dog03) {
        String duplicateName = null;

        if (dog01.getName().equals(dog02.getName())) {
            duplicateName = dog01.getName();

        }

        if (dog01.getName().equals(dog03.getName())) {
            duplicateName = dog01.getName();

        }

        if (dog02.getName().equals(dog03.getName())) {
            duplicateName = dog02.getName();

        }
        return duplicateName;
    }

    public void getOldest(Dog dog01, Dog dog02, Dog dog03) {
        Dog olDestDog;
        int maxOldestDog = 0;

        if (dog01.getAge() >= maxOldestDog) {
            maxOldestDog = dog01.getAge();
            olDestDog = dog01;
            System.out.print("\nOldest " + olDestDog);
        }

        if (dog02.getAge() >= maxOldestDog) {
            maxOldestDog = dog02.getAge();
            olDestDog = dog02;
            System.out.print("\nOldest " + olDestDog);
        }

        if (dog03.getAge() >= maxOldestDog) {
            olDestDog = dog03;
            System.out.print("\nOldest " + olDestDog);
        }
    }
}
