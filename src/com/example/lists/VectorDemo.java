package com.example.lists;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("Initial Vector Capacity : " + v.capacity());
        for (int i = 1; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println("Vector Capacity after adding 10 elements : " + v.capacity());
        v.addElement("A");
        System.out.println("Vector Capacity after adding 11th element : " + v.capacity());
        System.out.println(v);

    }
}
