package homework3_1;

import pract_task_4.Product;

import java.util.Comparator;

public class MinComparator implements Comparator <MinMaxCheck> {

    @Override
    public int compare(MinMaxCheck o1, MinMaxCheck o2) {
        return o1.getNum() - o2.getNum();
    }
}
