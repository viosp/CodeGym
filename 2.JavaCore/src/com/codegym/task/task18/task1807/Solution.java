package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filename);

        int count = 0;
        char ch = ',';
        int castAscii = (int) ch;

        while(inputStream.available() > 0){
            char x = (char) inputStream.read();
            if(x == castAscii){
                count+=1;
            }
        }
        inputStream.close();
        System.out.println(count);


    }
}
