package com.quantum;

/* 2.Write a program to sort HashMap by keys ? */

import java.util.Map;
import java.util.TreeMap;

public class Question2 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap2 = new TreeMap<>();
        hashMap2.put(4,"ryan");
        hashMap2.put(2, "Tom");
        hashMap2.put(3, "Harry");
        hashMap2.put(5,"Rich");
        hashMap2.put(1,"Mike");

        System.out.println(hashMap2);

    }

}
