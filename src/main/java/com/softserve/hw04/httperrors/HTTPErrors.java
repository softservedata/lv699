package com.softserve.hw04.httperrors;

public enum HTTPErrors {
    ERROR400 (400, "Error No.400 - Bad Request"),
    ERROR401 (401, "Error No.401 - Unauthorized"),
    ERROR402 (402, "Error No.402 - Payment Required"),
    ERROR403 (403, "Error No.403 - Forbidden"),
    ERROR404 (404, "Error No.404 - Not Found");

    private String name;
    private int number;

    HTTPErrors (int number, String name){
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printName(){
        System.out.println(getName());
    }
}
