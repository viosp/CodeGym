package com.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
A list and some threads

*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        SpecialThread special1 = new SpecialThread();
        SpecialThread special2 = new SpecialThread();
        SpecialThread special3 = new SpecialThread();
        SpecialThread special4 = new SpecialThread();
        SpecialThread special5 = new SpecialThread();

        Thread thread1 = new Thread(special1);
        Thread thread2 = new Thread(special2);
        Thread thread3 = new Thread(special3);
        Thread thread4 = new Thread(special4);
        Thread thread5 = new Thread(special5);

        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);


    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }
}
