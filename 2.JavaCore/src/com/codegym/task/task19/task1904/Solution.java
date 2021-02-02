package com.codegym.task.task19.task1904;

import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String str = fileScanner.nextLine();
            String[] split = str.split(" ");

            Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]), Integer.parseInt(split[3]) - 1, Integer.parseInt(split[4]));
            Date date = calendar.getTime();
            return new Person(split[2], split[0], split[1], date);

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
