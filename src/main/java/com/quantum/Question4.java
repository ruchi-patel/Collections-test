package com.quantum;

/* 4. Write a program to add element at particular index of ArrayList? */

import java.util.ArrayList;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(90);
        arrayList.add(30);
        arrayList.add(70);
        arrayList.add(20);
        System.out.println(arrayList);

        arrayList.add(2,80);
        System.out.println(arrayList);
    }

}
