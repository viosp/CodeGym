package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<10; i++){
            String s = reader.readLine();
            list.add(s);
        }

        String min = list.get(0);

        for(int i=0; i<10; i++) {
            if (list.get(i).length() >= min.length()) {
                min = list.get(i);
            } else{
                System.out.println(i);
                break;

            }
        }

    }
}

