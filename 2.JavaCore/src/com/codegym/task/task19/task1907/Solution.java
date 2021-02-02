package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        FileReader fileReader = new FileReader(filename);

        StringBuilder stringBuilder = new StringBuilder();

        while (fileReader.ready()) {
            char s = (char) fileReader.read();
            stringBuilder.append(s);
        }

        String nospaces = stringBuilder.toString().replaceAll("\\s", " ").replaceAll("\\p{P}", " ");

        for(String s : nospaces.split(" ")){
            if(s.equals("world")) count++;
        }

        System.out.println(count);

        reader.close();
        fileReader.close();

    }
}
