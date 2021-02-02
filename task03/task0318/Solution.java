package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String name = reader.readLine();
        String number = reader.readLine();
        int num = Integer.parseInt(number);
        
        System.out.println(name + " will take over the world in " +num + " years. Mwa-ha-ha!");
        
        
    }
}
