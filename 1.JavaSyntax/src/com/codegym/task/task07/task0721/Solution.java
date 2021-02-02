package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];

        for(int i = 0; i<array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = array[0];
        int minimum = array[0];

        for (int value : array) {
            if (value > maximum) {
                maximum = value;
            }
        }

        for (int value : array) {
            if (value < minimum) {
                minimum = value;
            }
        }


        System.out.print(maximum + " " + minimum);
    }
}
