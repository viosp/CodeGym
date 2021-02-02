package com.codegym.task.task19.task1925;

/* 
Long words

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        ArrayList<String> content = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(file1));

        String s;

        while ((s = reader.readLine()) != null) {
            content.add(s);
        }

        reader.close();

        StringBuffer sbLine = new StringBuffer();
        for (String line : content) {
            String[] splitedLine = line.split(" ");
            for (String word : splitedLine) {
                if (word.length() > 6)

                    sbLine.append(word).append(" ");
            }
        }

        String resultLine = sbLine.toString().trim().replaceAll(" ", ",");
        try (FileWriter fileWriter = new FileWriter(file2)) {
            fileWriter.write(resultLine);
        } catch (IOException ignore) {
            /* NOP */
        }
    }
}