package com.danielsoto;

public class Main {

    public static void main(String[] args) {
        // String
        String name = new String("Daniel");
        System.out.println("Nombre: " + name.toLowerCase());
    }

    // create static class Person
    static class Person {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
