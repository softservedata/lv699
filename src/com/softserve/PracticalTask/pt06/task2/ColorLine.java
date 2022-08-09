package com.softserve.PracticalTask.pt06.task2;

public class ColorLine extends Line {
    private String color;

    public ColorLine(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Color line :"+color);
    }
}