package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String surname;
        private int age;
        private int height;
        private int weight;
        private String address;

        public Human() {

        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String surname) {
            this.firstName = firstName;
            this.surname = surname;
        }

        public Human(String firstName, String surname, int age) {
            this.firstName = firstName;
            this.surname = surname;
            this.age = age;
        }

        public Human(String firstName, String surname, int age, int height) {
            this.firstName = firstName;
            this.surname = surname;
            this.age = age;
            this.height = height;
        }

        public Human(String firstName, String surname, int age, int height, int weight) {
            this.firstName = firstName;
            this.surname = surname;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String firstName, String surname, int age, int height, int weight, String address) {
            this.firstName = firstName;
            this.surname = surname;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.address = address;
        }

        public Human(String firstName, int height, int weight) {
            this.firstName = firstName;
            this.height = height;
            this.weight = weight;
        }

        public Human(String surname, int age) {
            this.surname = surname;
            this.age = age;
        }

        public Human(int age, int height) {
            this.age = age;
            this.height = height;
        }
    }
}
