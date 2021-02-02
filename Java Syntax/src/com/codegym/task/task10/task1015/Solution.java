package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] result = (ArrayList<String>[]) new ArrayList[3];

        result[0] = new ArrayList<String>();
        result[1] = new ArrayList<String>();
        result[2] = new ArrayList<String>();

        result[0].add("Mama");
        result[1].add("Mila");
        result[2].add("Ramu");

        return result;
    }
    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}