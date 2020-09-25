package com.quantum;

import java.util.*;

public class Question17 {

    public static void main(String[] args) {

        List<Employee> arrayList = new ArrayList<>();
        Employee e1 = new Employee("mike", 30, 1000, new Date());
        Employee e2 = new Employee("rich", 50, 2000, new Date());
        Employee e3 = new Employee("bob", 40, 2000, new Date());

        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);

        arrayList.sort(comparator);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    static Comparator<Employee> comparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee i1, Employee i2) {
            return i2.getAge() - i1.getAge();
        }
    };
}
