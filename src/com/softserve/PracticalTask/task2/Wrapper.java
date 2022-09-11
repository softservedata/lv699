package com.softserve.PracticalTask.task2;

public class Wrapper<T> {
    private T temp;

    public Wrapper(T temp) {
        this.temp = temp;
    }

    public T get() {
        return temp;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "temp=" + temp +
                '}';
    }
}
