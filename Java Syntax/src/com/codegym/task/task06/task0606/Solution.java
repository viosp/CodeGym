package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        while(N > 0){
            if(N % 2 == 0){
                even++;
            } else {
                odd++;
            }
            N /= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
