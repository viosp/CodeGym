package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("v", 4);
        map.put("n", 5);
        map.put("m", 6);
        map.put("k", 7);
        map.put("j", 8);
        map.put("h", 9);
        map.put("g", 55);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        HashMap<String, Integer> copy = new HashMap<>(map);

        for(Map.Entry<String, Integer> pair : copy.entrySet()) {
            if(pair.getValue() < 500 )
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}