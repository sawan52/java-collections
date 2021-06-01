package com.example.comparable_comparator;

import java.util.Comparator;
import java.util.TreeSet;

// Insert StringBuffer objects into TreeSet where all elements should be inserted in alphabetical order
public class ComparatorDemo3 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator3());
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("K"));
        ts.add(new StringBuffer("L"));
        System.out.println(ts);
    }
}

class MyComparator3 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        // for StringBuffer typecasting should be done by .toString() method
        String s1 = o1.toString();
        String s2 = o2.toString();

        return s1.compareTo(s2);
    }
}

