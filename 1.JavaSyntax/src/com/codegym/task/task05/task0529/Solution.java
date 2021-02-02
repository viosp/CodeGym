package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            String command = reader.readLine();
            if (command.equals("sum")) {
                System.out.println(sum);
                return;
            }
            int a = Integer.parseInt(command);
            sum += a;
        }
    }
}
