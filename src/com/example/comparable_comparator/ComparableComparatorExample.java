package com.example.comparable_comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableComparatorExample {

    public static void main(String[] args) {

        Employee e1 = new Employee("nag", 100);
        Employee e2 = new Employee("balaiah", 200);
        Employee e3 = new Employee("chiru", 50);
        Employee e4 = new Employee("venki", 150);
        Employee e5 = new Employee("nag", 100);

        // implementing default natural sorting order based on employee id
        System.out.println("Default natural sorting order based on employee id: ");
        TreeSet<Employee> t = new TreeSet<>();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);
        System.out.println();

        // implementing customize sorting order based on employee name
        System.out.println("Customized sorting order based on employee name: ");
        TreeSet<Employee> t1 = new TreeSet<>(new MyEmployeeComparator());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);

    }

}

class MyEmployeeComparator implements Comparator {

    // overriding compare method for implementing customized sorting order based on employee name
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        String s1 = e1.name;
        String s2 = e2.name;
        // default natural sorting order of names i.e alphabetical order
        return s1.compareTo(s2);
    }
}

class Employee implements Comparable {

    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " --> " + id;
    }

    // overriding compareTo method for implementing default natural sorting order based on employee id
    @Override
    public int compareTo(Object obj) {

        // user input id through employee object
        int id = this.id;

        Employee emp = (Employee) obj;
        // ids that are present in tree already
        int id2 = emp.id;

        if (id < id2) {
            return -1;
        } else if (id > id2) {
            return +1;
        } else {
            return 0;
        }

    }
}
