package com.codegym.task.task04.task0441;


/* 
Somehow average

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        
        if(a == b || a==c){
            System.out.println(a);
        } else {
            if((a <=b && a>=c) ||(a >=b && a<=c) ){
                System.out.println(a);
            }
            if((b <= a && b >= c) || (b >= a && b <= c)){
                System.out.println(b);
            }
            if((c <= a && c >= b) || (c >= a && c <= b)){
                System.out.println(c);
            }
        }
    }
}
