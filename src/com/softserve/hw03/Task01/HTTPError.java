package com.softserve.hw03.Task01;

public enum HTTPError {
    ERROR400("Bad Request",400),
    ERROR401("Unauthorized", 401),
    ERROR402("Payment Required", 402),
    ERROR403("Forbidden", 403),
    ERROR404("Not Found", 404),
    ERROR405("Method Not Allowed", 405);

    private String name;
      private int number;

    private HTTPError(String name, int number) {
         this.name = name;
         this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
