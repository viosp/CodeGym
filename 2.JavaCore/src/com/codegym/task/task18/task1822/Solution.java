package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));

        String s;

        while((s = bufferedReader.readLine()) != null){
            if(s.startsWith(args[0] + " ")){
                System.out.println(s);
                break;
            }

        }
        bufferedReader.close();
    }
}
