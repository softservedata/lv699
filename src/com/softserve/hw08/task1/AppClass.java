package com.softserve.hw08.task1;

import java.util.ArrayList;
import java.util.List;

public class AppClass {

    public static void main(String[] args) {

        List<Student> st = new ArrayList<>();
        st.add(new Student("FirstName1", "LastName1", 21, 6));
        st.add(new Student("FirstName2", "LastName2", 32, 2));


        for (Student current: st){
            System.out.println(current.activity());
            current.info();
        }
    }

}
