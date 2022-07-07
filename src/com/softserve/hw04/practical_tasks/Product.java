package com.softserve.hw04.practical_tasks;

public class Product {
    private String name;
    private double price;
    private double quantity;
    private static double item = 0;
    private static double biggest = 0;
    private static String namee = "";
    private static double quantitye = 0;
    private static String nameb = "";


    public Product() {
        name = "name";
        price = 0;
        quantity = 0;
    }

    public Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public static String getNamee() {
        return namee;
    }

    public static double getQuantitye() {
        return quantitye;
    }

    public static String getNameb() {
        return nameb;
    }


    public static double getItem() {
        return item;
    }

    public static double getBiggest() {
        return biggest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public double getQuantity() {

        return quantity;
    }

    public void setQuantity(double quantity) {

        this.quantity = quantity;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public double expensive() {
        if (item < getPrice()) {
            item = getPrice();
            namee = getName();
            quantitye = getQuantity();
        }
        return item;
    }

    public double biggest() {
        if (biggest < getQuantity()) {
            biggest = getQuantity();
            nameb = getName();
        }
        return biggest;
    }
}
