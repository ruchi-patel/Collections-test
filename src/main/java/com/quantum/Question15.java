package com.quantum;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question15 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        deque.add(60);
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);

        deque.addFirst(10);
        System.out.println(deque);

        deque.addLast(100);
        System.out.println(deque);

    }
}
