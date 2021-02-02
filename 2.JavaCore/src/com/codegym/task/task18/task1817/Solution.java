package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int total = 0;
        int spaces = 0;
        try (FileReader fileWriter = new FileReader(args[0])) {
            while (fileWriter.ready()) {
                int readedChar = fileWriter.read();
                total++;
                if (readedChar == (int) ' ') spaces++;
            }
        }
        if (total != 0) {
            double result = (double) spaces / total * 100;
            System.out.printf("%.2f", result);
        }
    }
}
