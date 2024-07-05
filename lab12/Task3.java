package lab12;

import java.util.LinkedList;

public class Task3 {


    public static class GenericQueue<E> extends LinkedList<E> {
        public void enqueue(E element) {
            addLast(element);
        }

        public E dequeue() {
            return removeFirst();
        }

        public E peek() {
            return getFirst();
        }

        public boolean isEmpty() {
            return super.isEmpty();
        }

        public int getSize() {
            return size();
        }
    }

    public static void main(String[] args) {
        GenericQueue<Integer> intQueue = new GenericQueue<>();

        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);

        System.out.println("Queue after enqueuing 1, 2, 3: " + intQueue);

        System.out.println("Dequeued element: " + intQueue.dequeue());
        System.out.println("Queue after dequeuing an element: " + intQueue);

        System.out.println("Front element: " + intQueue.peek());

        System.out.println("Is the queue empty? " + intQueue.isEmpty());

        System.out.println("Size of the queue: " + intQueue.getSize());
    }

}
