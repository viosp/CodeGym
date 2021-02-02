package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bf.readLine();
        String file2 = bf.readLine();

        ArrayList<String> content = new ArrayList<>();

        BufferedReader bf1 = new BufferedReader(new FileReader(file1));

        while(bf1.ready()){
            content.add(bf1.readLine());
                }

        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        for(String s : content){
            String[] splitline = s.trim().split(" ");
            for(String word : splitline){
                try{
                    int num = Integer.parseInt(word);
                    writer.write(word + " ");
                } catch (Exception ignore) {
                    
                }
            }
        }
        bf.close();
        bf1.close();
        writer.close();
    }
}
