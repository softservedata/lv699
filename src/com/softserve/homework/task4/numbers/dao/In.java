package com.softserve.homework.task4.numbers.dao;

public interface In {
     float readFloat(String... msg);
     int readInt(String... msg);
    void close();
}
