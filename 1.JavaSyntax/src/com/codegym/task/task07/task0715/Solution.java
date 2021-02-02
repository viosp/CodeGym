package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String a = "Sam";
        String b = "I";
        String c = "Am";
        String d = "Ham";

        ArrayList<String> list = new ArrayList<>();

        list.add(a);
        list.add(b);
        list.add(c);

        list.add(1, d);
        list.add(3, d);
        list.add(5, d);

        for(String s : list){
            System.out.println(s);
        }



    }
}
