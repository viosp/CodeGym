package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader(args[0])) {

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
