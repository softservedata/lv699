package com.softserve.hw03;

public class Person {
    private String firstname;
    private String lastname;
    private int birthYear;
    private int Year = 2022;
    private static  int Age=0;

    public Person() {
        firstname = "";
        lastname = "";
        birthYear = 0;
        Year = 2022;
        Age=0;
    }
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public Person(String firstname, String lastname, int birthYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public void  setbirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
        //-------------------




    public int getAge() {
            Age=Year - getBirthYear();
            return Age;
        }

        public void input(String firstName,String lastName, int birthYear){
            setFirstname(firstname);
            setLastname(lastname);
            setbirthYear(birthYear);

        }
    public void changeName(String fn,String ln){
        setFirstname(fn);
        setLastname(ln);

    }
    public String output() {
        return "Person{" +
                "firstname='" + getLastname() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", birthYear='" + getBirthYear() + '\'' +
                '}';
    }

    }
