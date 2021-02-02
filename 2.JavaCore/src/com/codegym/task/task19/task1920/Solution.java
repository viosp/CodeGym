package com.codegym.task.task19.task1920;

/* 
The richest

*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();

        String filename = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line;
        String [] split;
        Double currentValue;

        while((line = reader.readLine()) != null){
            split = line.split(" ");
            String name = split[0];
            Double value = Double.parseDouble(split[1]);

            if(map.containsKey(name)){
                currentValue = map.get(name);
                map.put(name, value + currentValue);
            } else {
                map.put(name, value);
            }

        }

        double maxSalary = map.firstEntry().getValue();
        for (double value : map.values()) {
            if (value > maxSalary) {
                maxSalary = value;
            }
        }

        TreeSet<String> names = new TreeSet<>();
        for (String name : map.keySet()) {
            if (maxSalary == map.get(name)) {
                names.add(name);
            }
        }

        for (String name : names) {
            System.out.println(name);
        }

        reader.close();
    }
}
