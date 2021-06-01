package com.example.maps;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        //HashMap<String, Integer> map = new HashMap<>();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("ch", 700);
        map.put("ven", 200);
        map.put("ba", 800);
        map.put("nag", 500);
        System.out.println(map);

        int x = map.put("ch", 1000); // if key are same then it will insert the new value but will return 700
        System.out.println(x);

        // adding all the keys from HashMap map into Set set.
        Set<String> set = map.keySet();
        System.out.println(set);

        // adding all the values from HashMap map into Collection collection.
        Collection<Integer> collection = map.values();
        System.out.println(collection);

        // adding all the keys and values from HashMap map into Set set1.
        Set set1 = map.entrySet();
        System.out.println(set1);

        Iterator itr = set1.iterator();
        while (itr.hasNext()) {
            Map.Entry me1 = (Map.Entry) itr.next();
            System.out.println(me1.getKey() + " --> " + me1.getValue());

            if (me1.getKey().equals("nag")) {
                me1.setValue(10000);
            }
        }

        // now return the new modified HashMap
        System.out.println(map);
    }
}
