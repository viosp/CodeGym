package com.codegym.task.task09.task0920;

/* 
Countdown

*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            try{
                Thread.sleep(100);
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
    }
}
