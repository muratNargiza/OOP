package lab11;

import java.util.ArrayList;
import java.util.HashSet;

public class Task4 {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        HashSet<E> set = new HashSet<>();
        ArrayList<E> result = new ArrayList<>();

        for (E element : list) {
            if (set.add(element)) {
                result.add(element);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(2);
        intList.add(4);
        intList.add(3);

        System.out.println("Original list: " + intList);
        ArrayList<Integer> uniqueIntList = removeDuplicates(intList);
        System.out.println("List with duplicates removed: " + uniqueIntList);

    }
}

