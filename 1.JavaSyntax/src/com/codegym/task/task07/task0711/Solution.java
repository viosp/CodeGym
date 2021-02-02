package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        String s = null;

        for (int i = 0; i < 5; i++) {
            s = reader.readLine();
            list.add(s);
        }

        for (int j = 0; j < 13; j++) {
                String  b = list.remove(4);
                list.add(0, b);
        }

        for(String a : list){
            System.out.println(a);
        }
    }
}

