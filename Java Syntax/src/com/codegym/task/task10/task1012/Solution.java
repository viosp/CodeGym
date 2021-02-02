package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Number of letters

*/

public class Solution {
    public static <Char> void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // Counting the number of letters
        int[] count = new int[alphabet.size()];
        for (String s : list) {
            for (char c : s.toCharArray()) {
                int index = alphabet.indexOf(c);
                if (index < 0) continue;

                count[index]++;
            }
        }

        // Output of the result
        for (int i = 0; i < alphabet.size(); i++) {
            char c = alphabet.get(i);
            System.out.println(c + " " + count[i]);
        }
    }


}
