package com.danielsoto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Student> students = new ArrayList<>();

       Student student1 = new Student("Maria Montoya", 21);
       Student student2 = new Student("Juan Montoya", 22);
       Student student3 = new Student("Pedro Montoya", 23);
       Student student4 = new Student("Ana Montoya", 24);
       Student student5 = new Student("Juan Montoya", 25);
       Student student6 = new Student("Pedro Montoya", 26);
       Student student7 = new Student("Ana Montoya", 27);
        students.add(student2);

        students.add(student1);
        students.add(student4);
        students.add(student3);
        students.add(student6);
        students.add(student7);
        students.add(student5);

        Iterator<Student> customerIterator = students.iterator();

        System.out.println("Antes de ordenar la Lista de estudiantes/n");

        //
        while (customerIterator.hasNext()){
            System.out.println(customerIterator.next());
        }

        Collections.sort(students, new CustomerSortingComparator());

        System.out.println("\nDespues de ordenar la Lista de estudiantes/n");

        for (Student customer : students) {
            System.out.println(customer);
        }
    }
}
