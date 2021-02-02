package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("two", df.parse("JUNE 1 1980"));
        map.put("three", df.parse("JUNE 1 1980"));
        map.put("four", df.parse("JUNE 1 1980"));
        map.put("five", df.parse("JUNE 1 1980"));
        map.put("six", df.parse("JUNE 1 1980"));
        map.put("seven", df.parse("JUNE 1 1980"));
        map.put("eight", df.parse("JUNE 1 1980"));
        map.put("nine", df.parse("JUNE 1 1980"));
        map.put("ten", df.parse("JUNE 1 1980"));

        return map;


    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8)
                map.remove(key);
        }
    }


    public static void main(String[] args) {

    }
}
