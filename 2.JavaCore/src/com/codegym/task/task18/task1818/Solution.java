package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileOutputStream outputStream = new FileOutputStream(file1, true);
        FileInputStream inputStream = new FileInputStream(file2);
        FileInputStream inputStream1 = new FileInputStream(file3);

        while(inputStream.available() > 0) {
            outputStream.write(inputStream.read());
        }

        while(inputStream1.available() > 0) {
            outputStream.write(inputStream1.read());
        }


        inputStream.close();
        inputStream1.close();
        outputStream.close();

    }
}
