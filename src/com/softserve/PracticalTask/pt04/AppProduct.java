package com.softserve.PracticalTask.pt04;



public class AppProduct {
    public static void main(String[] args) {
        Product p1 = new Product(20, 7,"CocaCola");
        Product p2 = new Product(18, 1, "Pepsi");
        Product p3 = new Product(15, 10,"Morshynska");
        Product p4 = new Product(30, 2, "Borjomi");

        Product.mostExpensive();

        System.out.println("The most expensive Product:"+ Product.nameProduct() + " price "+ Product.getPrice()+"UAH "+" quantity "+ Product.getQuantity());
        Product.biggestQuantity();// method dont work:::((((
        System.out.println("The biggest quantity:"+Product.getQuantity());
    }
}
