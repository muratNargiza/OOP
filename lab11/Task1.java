package lab11;

public class Task1 {

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Integer keyInt = 3;
        System.out.println("Index of " + keyInt + ": " + linearSearch(intArray, keyInt));

        String[] strArray = {"apple", "banana", "cherry", "date"};
        String keyStr = "banana";
        System.out.println("Index of " + keyStr + ": " + linearSearch(strArray, keyStr));
    }
}

