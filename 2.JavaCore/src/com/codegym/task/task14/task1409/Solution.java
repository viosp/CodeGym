package com.codegym.task.task14.task1409;

/* 
Bridges

*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void  println(Bridge WaterBridge){
        System.out.println(WaterBridge.getCarsCount());
    }

}

