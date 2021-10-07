package Java.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args){

        // Double side queue, which can be added or removed from both sides

        Deque<Integer> deque = new ArrayDeque();
        deque.add(10);
        deque.addFirst(20);
        deque.addLast(30);
        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);
    }
}
