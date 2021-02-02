package com.codegym.task.task20.task2017;

import java.io.*;

/* 
Deserialization

*/

public class Solution {
    A a = new A();

    public A getOriginalObject(ObjectInputStream objectStream) throws IOException, ClassNotFoundException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(objectStream))) {
            while(reader.ready()) {
                if (objectStream.readObject() == null) {
                    return null;
                }
            }
                a = (A) objectStream.readObject();
                return a;

        }catch(Exception e){
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
