package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "a");
        map.put("b", "n");
        map.put("c", "h");
        map.put("d", "r");
        map.put("e", "h");
        map.put("f", "k");
        map.put("g", "l");
        map.put("h", "p");
        map.put("i", "q");
        map.put("j", "s");

        return map;


    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count = 0;

        for(String n : map.values()){
            if(n.equals(name))
                count++;
            }
        return count;
        }


    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count = 0;

        for(String n : map.keySet()) {
            if(n.equals(lastName))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
