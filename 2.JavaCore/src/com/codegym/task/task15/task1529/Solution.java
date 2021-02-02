package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
            reset();
    }

    public static CanFly result;

    public static void reset() throws IllegalArgumentException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        try {
            String key = reader.readLine();
            if (key.equals("helicopter")) {
                result = new Helicopter();
            } else if (key.equals("plane")) {
                int num = Integer.parseInt(reader.readLine());
                result = new Plane(num);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
