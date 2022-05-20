package com.danielsoto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        int x = 2;
        int y = 3;

        // Arithmetic Operations
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Modulus: " + (x % y));
        // Math
        System.out.println("Absolute Value: " + Math.abs(x));
        System.out.println("Exponent: " + Math.pow(x, y));
        System.out.println("Square Root: " + Math.sqrt(x));
        System.out.println("Logarithm: " + Math.log(x));
        System.out.println("Natural Logarithm: " + Math.log10(x));
        System.out.println("Sin: " + Math.sin(x));
        System.out.println("Cos: " + Math.cos(x));
        System.out.println("Tan: " + Math.tan(x));
        System.out.println("PI: " + Math.PI);

        // assignment operators
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        // increment/decrement operators
        x++;
        x--;

        int danielAge = 29;
        int joseAge = 8;
        int minimumAge = 18;

        // comparison operators
        System.out.println("Daniel is older than Jose: " + (danielAge > joseAge));
        System.out.println("Daniel is younger than Jose: " + (danielAge < joseAge));
        System.out.println("Daniel is at least 18: " + (danielAge >= minimumAge));
        System.out.println("Daniel is at most 18: " + (danielAge <= minimumAge));
        System.out.println("Daniel is equal to Jose: " + (danielAge == joseAge));
        System.out.println("Daniel is not equal to Jose: " + (danielAge != joseAge));


        // String
        String name = new String("Daniel");
        System.out.println("localDateTime: " + localDateTime);
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
