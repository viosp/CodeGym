package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        
        String line;

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        try (FileWriter writer = new FileWriter(file2)){
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");


                    for (String s : split) {
                        if (s.matches(".+[0-9].+")) {
                            writer.write(s + " ");
                        }
                    }
                }

            } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();

    }
    }
