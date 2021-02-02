package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> divByThree = new ArrayList<>();
        ArrayList<Integer> divByTwo = new ArrayList<>();
        ArrayList<Integer> remaining = new ArrayList<>();

        for(int i=0; i<20; i++){
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }

        for(int i=0; i<20; i++) {
            int x = list.get(i);

            if ((x % 3 == 0) || (x % 2 == 0)) {
                if (x % 3 == 0) {
                    divByThree.add(x);
                }
                if (x % 2 == 0) {
                    divByTwo.add(x);
                }
                }
            else {
                remaining.add(x);
            }
        }

        printList(divByThree);
        printList(divByTwo);
        printList(remaining);
    }

    public static void printList(List<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }

    }
}
