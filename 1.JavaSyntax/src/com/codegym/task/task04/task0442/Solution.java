package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(reader.readLine());
        
        boolean minus = (a < 0);
        
        while(!minus){
            a = Integer.parseInt(reader.readLine());
            a+=a;
            
            }
        System.out.print(a);
        
    }
}
