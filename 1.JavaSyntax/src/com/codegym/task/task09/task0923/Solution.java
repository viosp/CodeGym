package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.InputStreamReader;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();


        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (isVowel(c))
                sb1.append(c).append(" ");
            else if (c != ' ')
                sb2.append(c).append(" ");
        }

        System.out.println(sb1);
        System.out.println(sb2);
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}