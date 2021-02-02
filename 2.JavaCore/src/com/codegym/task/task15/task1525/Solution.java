package com.codegym.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
File in a static block

*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        String line;

        try {
            FileReader fileReader = new FileReader(Statics.FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null){
                lines.add(line);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
