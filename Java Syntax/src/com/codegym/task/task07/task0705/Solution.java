package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        int[] first = new int[10];
        int[] second = new int[10];

        for(int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }



        for(int i=0; i<10; i++){
            first[i] = array[i];
            second[i] = array[i+10];
        }
        for(int i=0; i<10; i++){
            System.out.println(second[i]);
        }
    }
}
