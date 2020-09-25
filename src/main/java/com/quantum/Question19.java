package com.quantum;

/*

Format the input by using Scanner (5)
java 76
cpp 54
python 675
================================
java           076
cpp            054
python         675
================================

 */

import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String format = "%-10s%03d";
        String line = scanner.nextLine();

        String [] elements = line.split(" ");
        System.out.println(String.format(format, elements[0], Integer.parseInt(elements[1])));


    }
}


