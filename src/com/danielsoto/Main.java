package com.danielsoto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
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

        boolean isStudent = true;
        boolean isTeacher = false;

        // logical operators
        System.out.println("Daniel is a student AND: " + (isStudent && isTeacher));
        System.out.println("Daniel is a student OR: " + (isStudent || isTeacher));
        System.out.println("Daniel is a student NOT: " + (!isStudent));
        System.out.println("Daniel is a student XOR: " + (isStudent ^ isTeacher));

        // String
        String name = new String("Daniel");
        System.out.println("localDateTime: " + localDateTime);

        int adultAge = 21;
        if(joseAge >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

        // ternary operator
        String message = (danielAge >= adultAge) ? "You are an adult" : "You are not an adult";
        System.out.println(message);

        // switch statement
        int day = localDate.getDayOfWeek().getValue();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[2]);
        System.out.println(numbers.length);

        // for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        String[] names = {"Daniel", "Jose", "Juan", "Maria", "Sara"};
        for (String nameValue : names) {
            if(nameValue.startsWith("D")) {
                continue;
            }
            if(nameValue.startsWith("M")) {
                break;
            }
            System.out.println(nameValue);
        }
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
