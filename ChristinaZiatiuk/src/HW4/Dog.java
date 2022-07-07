package HW4;

public class Dog {
    private  String Name;
    private int Age;

    public enum Breed {
        PUG, POODLE, SHEEPDOG
    }

    private Breed breed;

    public Dog(String Name, Breed breed, int Age) {
        this.Name = Name;
        this.Age = Age;
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }



    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog("Rum", Breed.PUG, 1 );
        Dog dog2 = new Dog("Lee", Breed.POODLE, 2 );
        Dog dog3 = new Dog("Boo", Breed.PUG, 1 );

        System.out.println(dog1.getName()+ " " + dog1.getBreed ()+ " " +  dog1.getAge());
        System.out.println(dog2.getName()+ " " + dog2.getBreed ()+ " " + dog2.getAge());
        System.out.println(dog3.getName()+ " " + dog3.getBreed ()+ " " + dog3.getAge());
    }
}
