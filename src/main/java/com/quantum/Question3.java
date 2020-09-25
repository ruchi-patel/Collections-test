package com.quantum;

/* 3. Write a program to sort ArrayList in descending order? */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question3 {

    public static void main(String[] args) {
       List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(90);
        arrayList.add(30);
        arrayList.add(70);
        arrayList.add(20);

        arrayList.sort(Collections.reverseOrder());

        System.out.println(arrayList);
    }
}
