package pract_task_4;

import java.util.Comparator;

public class QuantityComparator implements Comparator<Product> {
@Override
public int compare(Product p1, Product p2) {
        return p2.quantity - p1.quantity;
        }

}
