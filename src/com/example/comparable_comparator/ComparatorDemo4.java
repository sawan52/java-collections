package com.example.comparable_comparator;

import java.util.Comparator;
import java.util.TreeSet;

// Insert String and StringBuffer objects into TreeSet where sorting order is in increasing length of Strings
// or StringBuffers. If two objects have same length then consider their alphabetical order

public class ComparatorDemo4 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator4());
        ts.add("A");
        ts.add(new StringBuffer("ABC"));
        ts.add(new StringBuffer("AA"));
        ts.add("XX");
        ts.add("ABCD");
        ts.add("A");
        System.out.println(ts);

    }
}

class MyComparator4 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();

        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 < l2)
            return -1;
        else if (l1 > l2)
            return +1;

        return s1.compareTo(s2);
    }
}
