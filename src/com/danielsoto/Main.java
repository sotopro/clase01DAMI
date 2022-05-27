package com.danielsoto;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();

        int sum1 = addition.add(1, 2);
        System.out.println("1 + 2 = " + sum1);

        int sum2 = addition.add(1, 2, 3);
        System.out.println("1 + 2 + 3 = " + sum2);
    }
}
