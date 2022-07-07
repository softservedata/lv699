package hw04;

public class Product {
    private final String name;
    private final int price;
    private final int quantity;

    public static void main(String[] args) {
        int maxPrice = 0;
        int maxQuantity = 0;
        Product mostExpensiveProduct = null;
        Product biggestQuantity = null;

        Product product01 = new Product();
        Product product02 = new Product("Tomato", 3, 1);
        Product product03 = new Product("Mango", 1, 4);
        Product product04 = new Product("Orange", 4, 12);

        if (product01.getPrice() > maxPrice) {
            maxPrice = product01.getPrice();
            mostExpensiveProduct = product01;
        }
        if (product02.getPrice() > maxPrice) {
            maxPrice = product02.getPrice();
            mostExpensiveProduct = product02;
        }
        if (product03.getPrice() > maxPrice) {
            maxPrice = product03.getPrice();
            mostExpensiveProduct = product03;
        }
        if (product04.getPrice() > maxPrice) {
            mostExpensiveProduct = product04;
        }

        System.out.println("Most expensive: " + mostExpensiveProduct);

        if (product01.getQuantity() > maxQuantity) {
            maxQuantity = product01.getQuantity();
            biggestQuantity = product01;
        }
        if (product02.getQuantity() > maxQuantity) {
            maxQuantity = product02.getQuantity();
            biggestQuantity = product02;
        }
        if (product03.getQuantity() > maxQuantity) {
            maxQuantity = product03.getQuantity();
            biggestQuantity = product03;
        }
        if (product04.getQuantity() > maxQuantity) {
            biggestQuantity = product04;
        }



        System.out.println("Biggest quantity: " + biggestQuantity.getName());
    }

    public Product() {
        name = "Bread";
        price = 2;
        quantity = 3;
    }

    public Product(String name, int prise, int quantity) {
        this.name = name;
        this.price = prise;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "\nName: " + name + ", Quantity: " + quantity;
    }
}
