package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        ArrayList<Integer> list = new ArrayList<>();

        while(inputStream.available() > 0){
            list.add(inputStream.read());
        }

        Collections.reverse(list);

        for(int x : list){
            outputStream.write(x);
        }

        inputStream.close();
        outputStream.close();

    }
}
