package com.quantum;

/* 8.Write a program to reverse ArrayList in java? */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question8 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(90);
        arrayList.add(30);
        arrayList.add(70);
        arrayList.add(20);
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
