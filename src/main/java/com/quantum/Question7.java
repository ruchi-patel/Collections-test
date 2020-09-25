package com.quantum;

/* 7. Write a program to convert HashSet to Array?*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Question7 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add(60);
        hashSet.add(60);
        System.out.println(hashSet);

        Integer[] array = hashSet.toArray(new Integer[hashSet.size()]);

        System.out.println(Arrays.toString(array));

    }
}
