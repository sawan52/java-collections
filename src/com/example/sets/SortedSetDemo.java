package com.example.sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {

        SortedSet ss = new TreeSet(); // TreeSet implements the SortedSet interface
        ss.add("A");
        ss.add("B");
        ss.add("C");
        ss.add("D");
        ss.add("E");

        System.out.println("first element: " + ss.first());
        System.out.println("last element: " + ss.last());

        System.out.println(ss.tailSet("D")); // returns element from D onwards --> D, E
        System.out.println(ss.headSet("C")); // returns element from starting till before C --> A, B

        System.out.println(ss.subSet("B", "E")); // returns from B to less than E --> B, C, D

        System.out.println(ss.comparator()); // default sorting order returns null

    }
}
