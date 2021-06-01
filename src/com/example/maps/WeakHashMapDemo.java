package com.example.maps;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) throws Exception {

        // HashMap map = new HashMap();
        WeakHashMap map = new WeakHashMap();
        Temp t = new Temp();
        map.put(t, "durga");
        System.out.println(map);

        // assigning t to null so that it will be available for garbage collection
        t = null;
        System.gc();
        // garbage collector will not work because Temp class object t is associated with HashMap
        // but it will work when HashMap is changed to WeakHashMap
        Thread.sleep(5000);
        System.out.println(map);

    }

}

class Temp {

    @Override
    public String toString() {
        return "temp";
    }

    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}
