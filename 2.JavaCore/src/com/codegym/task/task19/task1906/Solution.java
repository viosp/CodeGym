package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        ArrayList<Integer> ordinalNumbers = new ArrayList<>();

        try (FileReader fileReader = new FileReader(file1)) {
            while (fileReader.ready()) {
                ordinalNumbers.add(fileReader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter fileWriter = new FileWriter(file2);
        for (int i = 1; i < ordinalNumbers.size(); i += 2) {
            fileWriter.write(ordinalNumbers.get(i));
        }

        fileWriter.close();
        reader.close();
    }
}
