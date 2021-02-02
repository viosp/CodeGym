package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        FileInputStream stream = new FileInputStream(filename);

        TreeSet<Integer> list = new TreeSet();

        while(stream.available() > 0){
            int data = stream.read();
            list.add(data);
        }
        stream.close();

        for(int x : list) System.out.print(x + " ");
    }
}
