package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        
        int max = 0;

        FileInputStream stream = new FileInputStream(filename);
        while(stream.available() > 0){
            int data = stream.read();
            if(data > max){
                max = data;
            }
        }
        stream.close();
        System.out.println(max);
    }
}
