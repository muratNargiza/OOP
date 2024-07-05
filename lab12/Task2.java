package lab12;

import java.util.ArrayList;


public class Task2 {


    public static class GenericStack<E> {
        private ArrayList<E> list = new ArrayList<>();

        public int getSize() {
            return list.size();
        }

        public E peek() {
            return list.get(getSize() - 1);
        }

        public void push(E o) {
            list.add(o);
        }

        public E pop() {
            E o = list.get(getSize() - 1);
            list.remove(getSize() - 1);
            return o;
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        @Override
        public String toString() {
            return "stack: " + list.toString();
        }
    }

    public static void main(String[] args) {
        GenericStack<Integer> primeStack = new GenericStack<>();

        int count = 0;
        int number = 2;
        while (count < 50) {
            if (isPrime(number)) {
                primeStack.push(number);
                count++;
            }
            number++;
        }

        System.out.println("First 50 prime numbers in descending order:");
        while (!primeStack.isEmpty()) {
            System.out.print(primeStack.pop() + " ");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

