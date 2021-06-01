package com.example.sets;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // insertion will get preserved because of LinkedList as underlying data structure
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("Z");
        lhs.add(null);
        lhs.add(10);

        System.out.println(lhs.add("Z")); // will return false since we are trying to add duplicate element
        System.out.println(lhs);

    }
}
