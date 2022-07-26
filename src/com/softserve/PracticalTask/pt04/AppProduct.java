package com.softserve.PracticalTask.pt04;

public class AppProduct {

    public static void main(String[] args) {
        Product pr1 = new Product("Coca-colla", 25,10);
        Product pr2 = new Product("Morshynska", 15,7);
        Product pr3 = new Product("Borjomi", 10,8);
        Product pr4 = new Product("Pepsi", 30,6);



        System.out.println("the biggest quantity "+Product.getBiggestQuantity()+" product "+Product.getName());
        System.out.println();
        System.out.println("the highest price "+Product.getBigPrice()+" in the product "+ Product.getName()+" quantity "+Product.getQuantity());
    }

}
