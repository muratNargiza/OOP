package lab12;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Task4 {

    public static class MyPriorityQueue<E> extends PriorityQueue<E> {
        private static final long serialVersionUID = 1L;

        public MyPriorityQueue(Comparator<? super E> comparator) {
            super(comparator);
        }
    }

    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        MyPriorityQueue<Integer> pq = new MyPriorityQueue<>(comparator);

        pq.add(10);
        pq.add(20);
        pq.add(15);

        System.out.println("Priority queue elements in descending order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }


}

