package com.softserve.HomeWork.hw08.task1;

import java.util.ArrayList;
import java.util.List;

public class AppPerson {
    public static void main(String[] args) {
        Student st1 = new Student("Bob", "Arum", 22, 3);
        Student st2 = new Student("Iren", "Adler", 21, 1);
        st1.activity();
        st1.info();
        st2.activity();
        st2.info();


    }
}
