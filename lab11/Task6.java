package lab11;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task6 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

        // Measure the time to traverse using an iterator
        long startTime = System.nanoTime();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.nanoTime();
        long durationIterator = endTime - startTime;
        System.out.println("Time to traverse using iterator: " + durationIterator / 1000000 + " ms");

        // Measure the time to traverse using the get(index) method
        startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        long durationGetMethod = endTime - startTime;
        System.out.println("Time to traverse using get(index) method: " + durationGetMethod / 1000000 + " ms");
    }
}

