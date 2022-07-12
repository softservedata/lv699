package com.softserve.MyExample;

public enum HTTPError {
     ERROR400("400", "Bad Request"),
     ERROR401("401","Unauthorized"),
     ERROR402("402","Payment Required");


    private String name;
    private String description;

    HTTPError(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name +
                " - " + description;
    }

    public String getDescription() {
        return "description eror " + name + " is: " + description;
    }
}