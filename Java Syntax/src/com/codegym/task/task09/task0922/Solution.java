package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date1 = reader.readLine();

        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        Date date = ft1.parse(date1);

        SimpleDateFormat ft = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(ft.format(date).toUpperCase());
    }
}
