package com.softserve.hw06.first_task;

public class ApplBird {
    public static void main(String[] args) {
        Bird [] bird={
                new Chicken("Chiken"),
                new Penguin("Penguin"),
                new Eagle("Eagle"),
                new Swallow("Swallow")

        };
        for(Bird birds:bird){
            boolean isFly= birds.fly();
            System.out.println(birds.toString()+ "\nCan it fly?"+ "\nAnswer: "+isFly);
        }
//        Shape shapes[] = {
//        new Square(7.2, "MySquare"),
//        new Circle(5.8, "MyCircle"),
//        new Cube(6.7, "MyCube"),
//        new Ball(6.3, "MyBall")
   }
}
