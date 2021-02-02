package com.codegym.task.task19.task1910;

/* 
Punctuation

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();

        ArrayList<String> contents = new ArrayList<>();

        BufferedReader br1 = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));

        while(br1.ready()){
            contents.add(br1.readLine());
        }

        for(String s : contents){
            bw.write(s.replaceAll("\\p{P}", "").replaceAll("\\r\\n", ""));
        }



        br.close();
        br1.close();
        bw.close();
    }
}
