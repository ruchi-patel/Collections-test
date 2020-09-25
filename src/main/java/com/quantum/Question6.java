package com.quantum;

/* 6.Write a program to convert LinkedList to ArrayList? */

import java.util.Arrays;
import java.util.LinkedList;

public class Question6 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(90);
        linkedList.add(30);
        linkedList.add(70);
        linkedList.add(20);
        System.out.println(linkedList);

       Integer[] array1 = linkedList.toArray(new Integer[linkedList.size()]);

        System.out.println(Arrays.toString(array1));

    }
}
