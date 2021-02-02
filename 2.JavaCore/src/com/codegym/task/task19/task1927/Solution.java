package com.codegym.task.task19.task1927;

/* 
Contextual advertising

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newPrintStream);

        testString.printSomething();

        System.setOut(console);
        
        String[] byteArray = byteArrayOutputStream.toString().split("\\n");
        for(int i=0; i<byteArray.length; i++){
            System.out.println(byteArray[i]);
            if(i%2 !=0){
                System.out.println("CodeGym - online Java courses");
            }
        }

        
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
