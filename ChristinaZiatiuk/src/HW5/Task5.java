package HW5;

public class Task5 {
    public static void main(String[] args) {

        Eagle myEagle = new Eagle();
        Swallow mySwallow = new Swallow();
        Penguin myPenguin = new Penguin();
        Chicken myChicken = new Chicken();

        Bird[] myBirds = {myEagle, mySwallow, myPenguin, myChicken};

        for (int i = 0; i < myBirds.length; i++) {
            myBirds[i].showInformation();
            myBirds[i].fly();
        }
    }
}

