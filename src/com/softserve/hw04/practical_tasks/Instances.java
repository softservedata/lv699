package com.softserve.hw04.practical_tasks;

public class Instances {

    public static void main(String[] args) {
        Product product1 = new Product("pen", 3,10);
        product1.expensive();
        product1.biggest();

        Product product2 = new Product("oil", 10,5);
        product2.expensive();
        product2.biggest();
        Product product3 = new Product("ice cream", 30,20);
        product3.expensive();
        product3.biggest();
        Product product4 = new Product("flavour", 78,1);
        product4.expensive();
        product4.biggest();


        System.out.println("The most expensive item:"+ Product.getNamee()+ " "+ Product.getQuantitye());
        System.out.println("The name of the items, which has the biggest quantity:"+ Product.getNameb());
    }


}
