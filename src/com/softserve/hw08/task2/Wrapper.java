package com.softserve.hw08.task2;

public class Wrapper<T> {
    private T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public Wrapper() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
