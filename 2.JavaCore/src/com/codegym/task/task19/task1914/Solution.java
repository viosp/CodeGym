package com.codegym.task.task19.task1914;

/* 
Problem solving

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(console);

        String result = byteArrayOutputStream.toString();
        String[] resultArray = result.split(" ");
        int num1 = Integer.parseInt(resultArray[0]);
        int num2 = Integer.parseInt(resultArray[2]);
        int answer;

        if(resultArray[1].equals("+")){
            answer = num1 + num2;
        } else if(resultArray[1].equals("-")){
            answer = num1 - num2;
        } else {
            answer = num1 * num2;
        }

        System.out.println(num1+" "+resultArray[1]+" "+num2+" = "+answer);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

