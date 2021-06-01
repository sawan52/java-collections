package com.example.maps;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

    public static void main(String[] args) {

        // HashMap uses .equals() method for key comparison i.e key comparison
        //HashMap map = new HashMap();

        // IdentityHashMap uses == operator for key comparison
        IdentityHashMap map = new IdentityHashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        map.put(i1, "P");
        map.put(i2, "K");

        System.out.println(map);
    }

}
