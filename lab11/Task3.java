package lab11;

import java.util.ArrayList;

public class Task3 {

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        E maxElement = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            E currentElement = list.get(i);
            if (currentElement.compareTo(maxElement) > 0) {
                maxElement = currentElement;
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(8);
        intList.add(2);
        intList.add(10);
        intList.add(3);
        System.out.println("Maximum element in intList: " + max(intList));

    }
}



