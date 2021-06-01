package com.example.sets;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        // insertion will be based on default natural sorting order
        // tree set is using compareTo() method from Comparable interface to add values in TreeSet
        ts.add("A");
        ts.add("a");
        ts.add("B");
        ts.add("Z");
        ts.add("L");
        ts.add("g");

        // ts.add(10); will give compile time error because number cannot be cast to String
        System.out.println(ts);

    }
}
