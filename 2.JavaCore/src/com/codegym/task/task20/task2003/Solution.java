package com.codegym.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Introducing properties

*/

public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(data);

        load(fileInputStream);
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties prop = new Properties();

        for (Map.Entry<String, String> pair : properties.entrySet()){
            prop.setProperty(pair.getKey(), pair.getValue());
        }
        
        prop.store(outputStream, null);
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop = new Properties();
        prop.load(inputStream);
        for(Map.Entry<Object, Object> pair : prop.entrySet()){
            properties.put(pair.getKey().toString(), pair.getValue().toString());
        }
        
        inputStream.close();
    }

    public static void main(String[] args) {

    }
}
