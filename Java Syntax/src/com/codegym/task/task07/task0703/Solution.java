package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        int[] numbers = new int[10];

        for(int i=0; i < 10; i++){
            array[i] = reader.readLine();
            numbers[i] = array[i].length();
        }

        for(int i=0; i<10; i++){
            System.out.println(numbers[i]);
            
        }

    }
}
