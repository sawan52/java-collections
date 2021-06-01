package com.example.lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        System.out.println("init : " + l);

        ListIterator li = l.listIterator();
        while (li.hasNext()) {
            String s = (String) li.next();
            if (s.equals("Y")) {
                li.remove();
                System.out.println("after removing Y : " + l);
            } else if (s.equals("A")) {
                li.add("C");
                System.out.println("after adding C : " + l);
            } else if (s.equals("Z")) {
                li.set("D");
                System.out.println("after setting D : " + l);
            }
        }
        System.out.println("at final : " + l);

    }
}
