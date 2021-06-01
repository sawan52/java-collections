package com.example.lists;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add("Durga");
        l.add(30);
        l.add(null);
        l.add("Durga");
        System.out.println(l);

        l.set(0, "Software"); // set method overrides the content on the index position
        System.out.println(l);

        l.add(0, "Venky"); // add the content on index position and shift the other by 1 index value.
        System.out.println(l);

        l.removeLast();
        l.addFirst("CCC");
        System.out.println(l);

    }
}
