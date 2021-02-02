package com.codegym.task.task13.task1318;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFile = reader.readLine();
        FileInputStream inputStream = new FileInputStream(sourceFile);

        Scanner scanner = new Scanner(inputStream);

        StringBuilder builder = new StringBuilder();

        while(scanner.hasNextLine()){
            builder.append(scanner.nextLine()).append("\n");
        }

        System.out.print(builder.toString());

        scanner.close();
        reader.close();

    }
}