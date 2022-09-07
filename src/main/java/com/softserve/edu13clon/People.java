package com.softserve.edu13clon;

public class People extends FullName {

    private int age;

    public People(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People [ fullName = " + super.toString() + ", age=" + age + " ]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException { // public
        return super.clone();
        /*
        People myClone = (People) super.clone();
        //myClone.setFullName((FullName) getFullName().clone());
        return myClone;
        */
    }
}
