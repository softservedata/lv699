package com.softserve.edu14box;

public class Service<T extends IEntity> {

    public int work(T t) {
        int i = t.getId();
        return i;
    }
}
