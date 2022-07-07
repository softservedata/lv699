package com.softserve.hw03;

public class Person {
    private final int year=2022;
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        firstName = " ";
        lastName = " ";
        birthYear = 0;
    }

    public Person(String firstName, String lastName,int birthYear ) {
        this.firstName = firstName;
        this.lastName = lastName;
       this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName= " + firstName +
                "lastName= " + lastName +
                "birthYear=" + birthYear +
                '}';
    }

    //.............................methods
    public int getAge() {
        return  year - getBirthYear();

    }
    public  void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);

    }

}
