package com.softserve.hw05.Task01;

public class AppBird {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Has",0);
        Swallow swallow = new Swallow("Has", 0);
        Penguin penguin = new Penguin("Hasn't", 0);
        Chicken chicken = new Chicken("Has", 1);

        Bird [] birds = {eagle, swallow, penguin, chicken};
        Bird.info(birds);
    }
}
