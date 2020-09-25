package com.quantum;

/* 1.Write a program to iterate the HashMap ? */

import java.util.HashMap;
import java.util.Iterator;


public class Question1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Mike");
        hashMap.put(2, "Tom");
        hashMap.put(3, "Harry");
        hashMap.put(4, "ryan");
        hashMap.put(5, "Rich");

        Iterator<Integer> iterator = hashMap.keySet().iterator();

        while (iterator.hasNext()) {
            int key = iterator.next();
            String value = hashMap.get(key);
            System.out.println(key + " " + value);
        }
    }
}
