package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream stream = new FileInputStream(file1);
        FileOutputStream stream1 = new FileOutputStream(file2);
        FileOutputStream stream2 = new FileOutputStream(file3);


        int half = (stream.available() + 1) / 2;
        int bytes = 0;

        while(stream.available() > 0){
            if(bytes < half){
                stream1.write(stream.read());
                bytes++;
            } else {
                stream2.write(stream.read());
            }

        }
        stream.close();
        stream1.close();
        stream2.close();
    }
}
