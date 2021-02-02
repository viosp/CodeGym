package com.codegym.task.task19.task1909;

/* 
Changing punctuation marks

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bf.readLine();
        String file2 = bf.readLine();

        BufferedReader bf1 = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));

        ArrayList<String> content = new ArrayList<>();

        while(bf1.ready()){
            content.add(bf1.readLine());
        }

        for(String s : content){
            bw.write(s.replaceAll("\\.","!"));
        }

        bf.close();
        bf1.close();
        bw.close();
    }
}
