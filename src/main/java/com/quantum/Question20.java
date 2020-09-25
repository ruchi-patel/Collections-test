package com.quantum;

/**
 * Convert Roman number into Integer
 */

public class Question20 {

    int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    int romanToInteger(String str) {
        int integerValue = 0;

        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));

            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));

                if (s1 >= s2) {
                    integerValue = integerValue + s1;
                } else {
                    integerValue = integerValue + s2 - s1;
                    i++;
                }
            } else {
                integerValue = integerValue + s1;
                i++;
            }
        }

        return integerValue;
    }

    public static void main(String[] args) {
        Question20 obj = new Question20();

        String str = "IIV";
        System.out.println(obj.romanToInteger(str));
    }
}
