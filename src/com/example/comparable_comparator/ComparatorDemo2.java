package com.example.comparable_comparator;

import java.util.Comparator;
import java.util.TreeSet;

// Insert String objects into TreeSet where all elements should be inserted in reverse alphabetical order
public class ComparatorDemo2 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator2());
        ts.add("Roja");
        ts.add("Shobharani");
        ts.add("Raja Kumari");
        ts.add("G");
        ts.add("Ramula");
        System.out.println(ts);
    }
}

class MyComparator2 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;

        return s2.compareTo(s1); // making descending order
    }
}
