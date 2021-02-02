package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        Human human1 = new Human("a1", true, 2);
        Human human2 = new Human("a2", true, 3);

        Human father = new Human("name", true, 90);
        Human mother = new Human("name", false, 90);

        Human human5 = new Human("a1", true, 2, father ,  mother);
        Human human6 = new Human("a2", true, 3, father ,  mother);
        Human human7 = new Human("a3", true, 4, father ,  mother);
        Human human8 = new Human("a4", true, 5, father ,  mother);
        Human human9 = new Human("a4", true, 5, father ,  mother);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human8.toString());



    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}