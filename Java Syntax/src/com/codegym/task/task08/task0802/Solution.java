package com.codegym.task.task08.task0802;

/* 
HashMap of 10 pairs

*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<>();

        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("cantaloupe");
        set.add("blackberry");
        set.add("ginseng");
        set.add("strawberry");
        set.add("iris");
        set.add("potato");

        for(String text : set){
            System.out.println(text);
        }



    }
}
