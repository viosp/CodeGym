package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<>();

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(bis.readLine());
        }

        String maxSizeElement = strings.get(0);
        for (String element : strings) {
            if (element.length() > maxSizeElement.length()) {
                maxSizeElement = element;
            }
        }

        for (String element : strings) {
            if (element.length() == maxSizeElement.length()) {
                System.out.println(element);
            }
        }
    }
}
