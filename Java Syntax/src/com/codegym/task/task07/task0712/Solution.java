package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = bis.readLine();
            list.add(s);
        }

        String minSizeElement = list.get(0);
        int posMinElement = 0;
        String maxSizeElement = list.get(0);
        int posMaxElement = 0;
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < minSizeElement.length()) {
                minSizeElement = list.get(i);
                posMinElement = i;
            } else if (list.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = list.get(i);
                posMaxElement = i;
            }
        }

        if (posMinElement < posMaxElement) {
            System.out.println(minSizeElement);
        } else if (posMaxElement < posMinElement) {
            System.out.println(maxSizeElement);
        }
    }
}
