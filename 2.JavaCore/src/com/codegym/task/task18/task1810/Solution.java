package com.codegym.task.task18.task1810;

/* 
DownloadException

*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
        String file = reader.readLine();

        try (FileInputStream streamReader = new FileInputStream(file)) {
            if(streamReader.available() < 1000) throw new DownloadException();

            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
