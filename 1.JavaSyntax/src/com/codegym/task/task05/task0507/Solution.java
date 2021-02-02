package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum=0;
        int count = 0;

        while(true){
            double a = Double.parseDouble(reader.readLine());
            sum+=a;
            count++;

            if(a==-1.0){
                System.out.println(sum/count);
                return;
            }
            
        }
    }
}

