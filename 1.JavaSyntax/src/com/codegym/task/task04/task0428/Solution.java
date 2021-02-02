package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        
        boolean positivea = (a > 0);
        boolean positiveb = (b > 0);
        boolean positivec = (c > 0);
        
        int count =0;
        
        if(positivea){
            count++;
        } if(positiveb){
            count++;
        } if(positivec){
            count++;
        }
        System.out.println(count);

    }
}
