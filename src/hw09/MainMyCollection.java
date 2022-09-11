package hw09;

import examples.generic.example.A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class MainMyCollection {
    private static final Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> myCollection;
        ArrayList<Integer> newCollection;

        MainMyCollection obj = new MainMyCollection();

        myCollection = obj.addRandomIntegersToArrayList(10);
        System.out.println("Adding random ten integers to list myCollection:" + "\n" + myCollection);

        newCollection = obj.findElementMoreThanFive(myCollection);
        System.out.println("\nFind an element > 5, list newCollection:" + "\n" + newCollection);

        System.out.println("\nRemove an element > 20, list newCollection:" + "\n"
                + obj.rmElementMoreThanTwenty(myCollection));


        System.out.println("\nInsert an element with a fixed position to List: " + "\n");
                obj.insertElementToList(myCollection);

                obj.sortAndPrintArrayList(myCollection);

    }

    public ArrayList<Integer> addRandomIntegersToArrayList(int _number) {
        ArrayList<Integer> _outList = new ArrayList<>();
        for (int i = 0; i < _number; i++) {
            _outList.add(random.nextInt(25));
        }
        return _outList;
    }


    public ArrayList<Integer> findElementMoreThanFive(ArrayList<Integer> _inList) {
        ArrayList<Integer> _outList = new ArrayList<>();
        for (Integer number : _inList) {
            if (number > 5) {
                _outList.add(number);
            }
        }
        return _outList;
    }

    public ArrayList<Integer> rmElementMoreThanTwenty(ArrayList<Integer> _inList) {
        Iterator<Integer> iterator = _inList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 20) {
                iterator.remove();
            }
        }
        return _inList;
    }

    public ArrayList<Integer> insertElementToList(ArrayList<Integer> _inList) {
        _inList.add(2, 1);
        _inList.add(5, -4);
        _inList.add(8, -3);

        for (int i = 0; i < _inList.size(); i++) {
            System.out.println("Position: " + i + ", " + "Value of element: " + _inList.get(i));
        }
        return _inList;
    }

    public ArrayList<Integer> sortAndPrintArrayList(ArrayList<Integer> _inList) {
        _inList.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList: " + _inList);
        return _inList;
    }
}
