package com.quantum;

/* 5.Write a program to remove element from specified index of ArrayList?*/

import java.util.ArrayList;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(90);
        arrayList.add(30);
        arrayList.add(70);
        arrayList.add(20);
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
