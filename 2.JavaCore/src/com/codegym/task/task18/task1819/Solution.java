package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String first = reader.readLine();
        String second = reader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream inputStream1 = new FileInputStream(first);
        FileInputStream inputStream2 = new FileInputStream(second);

        while (inputStream2.available() > 0) {
            byteArrayOutputStream.write(inputStream2.read());
        }
        while (inputStream1.available() > 0) {
            byteArrayOutputStream.write(inputStream1.read());
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(first)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }

        byteArrayOutputStream.close();
        inputStream1.close();
        inputStream2.close();
    }
}
