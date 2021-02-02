package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i< 5; i++){
            list.add(reader.readLine());
        }

        String shortest = list.get(0);
        for(String element : list){
            if(element.length() < shortest.length()){
                shortest = element;
            }
        }

        for(String element : list){
            if(element.length() == shortest.length()){
                System.out.println(element);
            }
        }

    }


}
