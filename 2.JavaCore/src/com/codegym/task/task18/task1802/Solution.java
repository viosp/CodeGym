package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        FileInputStream stream = new FileInputStream(filename);

        int min = 255;

        while(stream.available() > 0){
            int data = stream.read();
            if(data < min){
                min = data;
            }
        }
        stream.close();
        System.out.println(min);
    }
}
