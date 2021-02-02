package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> result = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s;
            while (true) {
                s = reader.readLine();
                result.add(Integer.parseInt(s));
            }
        } catch (Exception e) {
            for (Integer value : result)
                System.out.println(value);
        }
    }
}
