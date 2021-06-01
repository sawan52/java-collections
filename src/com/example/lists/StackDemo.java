package com.example.lists;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // LIFO : Last In First Out
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        System.out.println(s);

        System.out.println(s.pop()); // D
        System.out.println(s);

        System.out.println(s.peek()); // returns top of stack element without removing it from stack --> C
        System.out.println(s);

        System.out.println(s.search("A")); // returns the offset value of A (starts form top of stack with 1)
        System.out.println(s.search("Z"));
    }
}
