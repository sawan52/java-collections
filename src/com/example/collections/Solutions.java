package com.example.collections;

import java.util.Set;
import java.util.TreeSet;

public class Solutions {

    public static void main(String[] args) {

        int[] arr = {1, 5, 9, 7, 8, 9, 4, 5, 6, 4, 1, 2, 3, 8, 2, 1};

        Set<Integer> set = removeDuplicates(arr);

        System.out.println(set);
    }

    public static Set<Integer> removeDuplicates(int[] arr) {

        Set<Integer> set = new TreeSet<>();

        for (int j : arr) {
            set.add(j);
        }
        return set;
    }
}
