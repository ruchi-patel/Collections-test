package com.quantum;

/*18.write a program that would compress the length of string,
and compare the length of the compressed string to the input string and return whichever one is smaller.
 Example would be: input string "aaabcccc" would be compressed to "a3b1c4".
 */

import java.util.Map;
import java.util.TreeMap;

public class Question18 {
    public String compression(String string) {
        Map<Character, Integer> characterMap = new TreeMap<>();

        for (int i = 0; i < string.length(); i++) {

            Integer count = characterMap.get(string.charAt(i));
            if (count == null) {
                count = 0;
            }
            count = count + 1;
            characterMap.put(string.charAt(i), count);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : characterMap.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }

        if (sb.length() > string.length()) {
            return string;
        } else {
            return sb.toString();
        }

    }

    public static void main(String[] args) {
        Question18 object = new Question18();
        String output = object.compression("aaabbb");
        System.out.println(output);
    }
}


