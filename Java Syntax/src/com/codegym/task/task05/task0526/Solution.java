package com.codegym.task.task05.task0526;

/* 
Man and woman

*/


public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("bob", 20, "abc");
        System.out.println(man1.toString());
        Man man2 = new Man("bobby", 21, "abcdd");
        System.out.println(man2.toString());


        Woman woman1 = new Woman("siv", 22, "nnn");
        System.out.println(woman1.toString());
        Woman woman2 = new Woman("sivi", 23, "nkk");
        System.out.println(woman2.toString());
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " +address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " +address;
        }
    }
}
