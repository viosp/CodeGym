package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file);

        Scanner scanner = new Scanner(inputStream);

        List<Integer> data = new ArrayList<>();

        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                data.add(value);
            }
        }

        Collections.sort(data);

        for (Integer value : data) {
            System.out.println(value);
        }

        scanner.close();
        inputStream.close();
    }
}
