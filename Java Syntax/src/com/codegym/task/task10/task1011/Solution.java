package com.codegym.task.task10.task1011;

/* 
Big salary

*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";
        for (int i = 0; i < 43; i++) {
            System.out.println(s);
            s = s.substring(1);
        }
    }
}


