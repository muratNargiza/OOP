package lab11;

public class Task2 {

    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0) {
            return null;
        }

        E maxElement = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(maxElement) > 0) {
                maxElement = list[i];
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {

        Integer[] intArray = {5, 8, 2, 10, 3};
        System.out.println("Maximum element in intArray: " + max(intArray));

        Double[] doubleArray = {3.5, 2.1, 7.8, 1.6, 5.2};
        System.out.println("Maximum element in doubleArray: " + max(doubleArray));

    }
}

