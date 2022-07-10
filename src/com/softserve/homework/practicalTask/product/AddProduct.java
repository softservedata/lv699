package com.softserve.homework.practicalTask.product;

enum Product {
    PRODUCT1("Apple", 12.5, 10),
    PRODUCT2("Pear", 16, 2),
    PRODUCT3("Grapes ", 37, 20),
    PRODUCT4("Orange ", 38, 15);

    private String name;
    private double price;
    private int quantity;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
        Product() {
        }
        public void inform(){
            System.out.println("the most expensive is : "+name+" , prise is:"+price+" , quantity is:"+quantity);
        }
    }
public class AddProduct {
    public static void main(String[] args) {
        Product[] array = new Product[4];
        array[0] = Product.PRODUCT1;
        array[1] = Product.PRODUCT2;
        array[2] = Product.PRODUCT3;
        array[3] = Product.PRODUCT4;

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int x = array[i].getQuantity();
            if (x > max)
                max = x;
        }
        System.out.println("max.quantity :" + max);
        for (int i = 0; i < array.length; i++) {
            if (array[i].getQuantity() == max)
            array[i].inform();

        }
        double max1 = 0;
        for (int j = 0; j < array.length; j++) {
            double y = array[j].getPrice();
            if (y > max1)
                max1 = y;
        }
        System.out.println("max.price :" + max1);
        for (int j = 0; j < array.length; j++) {
            if (array[j].getPrice() == max1)
                array[j].inform();

        }
    }
}

