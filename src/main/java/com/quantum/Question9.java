package com.quantum;

/* 9.Write a program to sort ArrayList using Comparable and Comparator?(5)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question9 {

    public static void main(String[] args) {
        List<Customer> arrayList = new ArrayList<>();
        Customer customer1 = new Customer("Test1", 1, 2222222, "address", "city", 12345);
        Customer customer2 = new Customer("Test2", 2, 2222222, "address", "city", 12345);
        Customer customer3 = new Customer("Test3", 3, 2222222, "address", "city", 12345);

        arrayList.add(customer1);
        arrayList.add(customer2);
        arrayList.add(customer3);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        arrayList.sort(comparator);
        System.out.println(arrayList);

    }

    static Comparator<Customer> comparator = new Comparator<Customer>() {
        @Override
        public int compare(Customer o1, Customer o2) {

            return o2.getAge() - o1.getAge();
        }
    };
}
