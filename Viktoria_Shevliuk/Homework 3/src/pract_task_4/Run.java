package pract_task_4;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
//        Product p1 = new Product("P1", 23, 34);
//        Product p2 = new Product("P2", 15, 12);

        List<Product> list = new ArrayList<Product>();

        list.add(new Product("p1", 23, 34));
        list.add(new Product("p2", 15, 12));
        list.add(new Product("p3", 40,5));
        list.add(new Product("p4", 5,40));

        list.sort(new PriceComparator());
        for (Product p0 : list) {
            p0.Print1();
            break;
        }

        list.sort(new QuantityComparator());
        for (Product p0 : list) {
            p0.Print2();
            break;
        }

    }

}
