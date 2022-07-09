package com.softserve.hw04.HomeWork;

public enum HTTPError {
    ERROR400("400", "Bad Request"),
    ERROR401("401","Unauthorized"),
    ERROR402("402","Payment Required"),
    ERROR403("403","Forbidden"),
    ERROR404("404","Not Found"),
    ERROR405("405","Method Not Allowed"),
    ERROR406("406","Not Acceptable"),
    ERROR407("406","Proxy Authentication Required");

    //read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)


    private String name;
    private String  description;

    private HTTPError (String name, String description) {
       this.name=name;
        this.description=description;
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
