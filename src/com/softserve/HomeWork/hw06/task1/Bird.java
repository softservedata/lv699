package com.softserve.HomeWork.hw06.task1;

//Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  
//        Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
//        Create array Bird and add different birds to it.
//        Call fly() method for all of it. Output the
//        information about each type of created bird.


//Розробіть абстрактний клас Bird з атрибутами feathers і layEggs і абстрактним методом fly().
//        Розробити класи FlyingBird і NonFlyingBird. Створіть клас Орел, Ластівка, Пінгвін і Курка.
//        Створіть масив Bird і додайте до нього різних птахів.
//        Викличте метод fly() для всього цього. Виведіть
//        інформація про кожен вид створеного птаха.

public abstract class Bird {
    String feathers;
    boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        layEggs = layEggs;
    }

    public abstract String fly();


    public abstract String info();
}
