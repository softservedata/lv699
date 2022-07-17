package com.softserve.PracticalTask.pt04;

public class Product {
    private static double price;
    private static int quantity;
    private static String nameProduct;
    private static String expensiveProduct=" ";
    private static String biggestProduct=" ";
    private static String getNameProduct = "";

    public static int getBiggest() {
        return biggest;
    }

    public static void setBiggest(int biggest) {
        Product.biggest = biggest;
    }

    public static void setBiggestProduct(String biggestProduct) {
        Product.biggestProduct = biggestProduct;
    }

    public static String getBiggestProduct() {
        return biggestProduct;
    }

    private static double expensive;
    private static int biggest;




    public Product() {
        this.price = 0;
        this.quantity = 0;
        this.nameProduct = " ";
        this.expensive = 0;
        this.biggest = 0;

    }

    public Product(double price, int quantity, String nameProduct) {
        this.price = price;
        this.quantity = quantity;
        this.nameProduct = nameProduct;
    }

    public static double expensiveProduct() {
        return expensive;
    }
    public static double biggestProduct() {
        return biggest;
    }




    public static double getPrice() {
        return price;
    }

    public static String nameProduct() {
        return nameProduct;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public static int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "Product " +
                "price= " + price +
                " quantity= " + quantity +
                " nameProduct= " + nameProduct +
                ':';
    }


    public static int biggestQuantity() {


        if (biggest > getQuantity()) {
            biggest = getQuantity();
            biggestProduct = getNameProduct;
        }

        return biggest;

    }
    public static double mostExpensive() {

        if (expensive > getPrice()) {
            expensive = getPrice();
            expensiveProduct = nameProduct;
            quantity = getQuantity();
        }
        return expensive;

    }


}









