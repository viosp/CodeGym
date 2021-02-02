package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Longest sequence

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        
        int count = 1;
        int max = 1;
        
        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                max++;
            } else if (max > count) {
                count = max;
                max = 1;
            } else {
                max = 1;
            }
            
        }
        
        if (max > count) {
            count = max;
        }

        System.out.println(count);

    }
}