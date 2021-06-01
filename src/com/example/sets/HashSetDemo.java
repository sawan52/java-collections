package com.example.sets;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet hs = new HashSet(); // insertion order is not preserved & it is based on HashCode of object
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("Z");
        hs.add(null);
        hs.add(10);

        System.out.println(hs.add("Z")); // will return false since we are trying to add duplicate element
        System.out.println(hs);

    }
}
