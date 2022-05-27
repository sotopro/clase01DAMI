package com.danielsoto;

import java.util.Comparator;

public class CustomerSortingComparator implements Comparator<Student> {
    @Override
    public int compare(Student custumer1, Student custumer2) {
        int NameCompare = custumer1.getName().compareTo(custumer2.getName());

        int AgeCompare = custumer1.getAge().compareTo(custumer2.getAge());

        return (NameCompare == 0) ? AgeCompare : NameCompare;
    }
}
