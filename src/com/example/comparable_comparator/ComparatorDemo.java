package com.example.comparable_comparator;

import java.util.Comparator;
import java.util.TreeSet;

// insert element in treeSet and sorting order should be descending
public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator());
        ts.add(10);
        ts.add(0); // --> compare(0, 10); since 0 has to come after 10 then it should return +1
        ts.add(15);
        ts.add(5);
        ts.add(20);
        ts.add(20);
        System.out.println(ts);
    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        // o2 will be root
        // o1 will be inserted element
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if (i1 < i2) {
            return +1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }
    }
}

