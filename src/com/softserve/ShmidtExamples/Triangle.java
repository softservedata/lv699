package com.softserve.ShmidtExamples;

class Triangle extends TwoDShape {
    String style;


    double area() {
        return width * height / (2*2);
    }
    double area2(){
        return width +height;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

