package com.codegym.task.task09.task0927;

import java.util.*;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();

        map.put("a", new Cat("a"));
        map.put("s", new Cat("a"));
        map.put("d", new Cat("a"));
        map.put("f", new Cat("a"));
        map.put("g", new Cat("a"));
        map.put("h", new Cat("a"));
        map.put("j", new Cat("a"));
        map.put("k", new Cat("a"));
        map.put("l", new Cat("a"));
        map.put("p", new Cat("a"));

        return map;
        }


    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<Cat>(map.values());

        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
