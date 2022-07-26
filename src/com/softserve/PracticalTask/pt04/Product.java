package com.softserve.PracticalTask.pt04;

public class Product {
    private static String name;
    private static int price;
    private static int quantity;
    public static int bigPrice;

    public static void setBigPrice(int bigPrice) {
        Product.bigPrice = bigPrice;
    }

    public static int biggestQuantity;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        bigPrice = 1;
        this.biggestQuantity = 0;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public static int getQuantity() {
        return quantity;
    }

    public static int getBigPrice() {
        if (price > bigPrice) {

            bigPrice = price;
        }

        return bigPrice;
    }

        public static int getBiggestQuantity () {
            if (quantity > biggestQuantity) {
                biggestQuantity = quantity;

            }
            return quantity;
        }

        @Override
        public String toString () {
            return "Product:" +
                    "name=" + name +
                    " price=" + price +
                    " quantity=" + quantity +
                    ';';
        }
    }

