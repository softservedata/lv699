package pract_task_4;

//     Display the name and quantity of the most expensive item.
//     Display the name of the items, which has the biggest quantity.


public class Product {
    protected String name;
    protected int price;
    protected int quantity;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void Print1(){
        System.out.println("\nthe name and quantity of the most expensive item: \nname: "+ getName() + ",  \nquantity: "+ getQuantity());
    }

    public void Print2(){
        System.out.println("\nthe name of the item, which has the biggest quantity: \nname: "+ getName());
    }




}
