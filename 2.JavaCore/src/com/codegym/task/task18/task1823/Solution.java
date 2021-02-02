package com.codegym.task.task18.task1823;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while(!(s = reader.readLine()).equals("exit")){
            new ReadThread(s).start();
        }
    }

    public static class ReadThread extends Thread {
        String filename;


        public ReadThread(String fileName) {
            this.filename = fileName;
        }


        @Override
        public void run() {
            byte[] arr = new byte[256];
            int count = 0;
            int max = 0;
            
            try (FileInputStream inputStream = new FileInputStream(filename)) {
                while (inputStream.available() > 0) {
                    int x = inputStream.read();
                    arr[x]++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (int i=0; i<arr.length; i++) {
                if(arr[i] > count) {
                    count = arr[i];
                    max = i;
                }
            }
            
            resultMap.put(filename, max);


        }
    }

}

