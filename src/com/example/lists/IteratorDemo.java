package com.example.lists;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println(al);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Integer integer = (Integer) itr.next();
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            } else {
                itr.remove();
            }
        }
        System.out.println();
        System.out.println(al);

    }
}
