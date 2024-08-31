package collection_framework.collectionAndMap;

import java.util.*;

public class LearnMap {
    public static void main(String[] args) {
        //Java Map Interface: In Java, elements of Map are stored in key/value pairs. Keys are unique values associated
        //with individual values. A map cannot contain duplicate keys. And, each key is associated with a single value.
        //This Map interface is implemented by HashMap, TreeMap, LinkedHashMap, etc.

        /*
        Methods of Map:
        1) put(K, V): Inserts the association of a key K and a value V into the map. If the key is already present, the
           new value replaces the old value.
        2) putAll(): Inserts all the entries from the specified map to this map.
        3) putIfAbsent(K, V): Inserts the association if the key K is not already associated with the value V.
        4) get(K): Returns the value associated with the specified key K. If the key is not found, it returns null.
        5) getOrDefault(K, defaultValue): Returns the value associated with the specified key K. If the key is not found
           , it returns the defaultValue.
        6) containsKey(K): Checks if the specified key K is present in the map or not.
        7) containsValue(V): Checks if the specified value V is present in the map or not.
        8) replace(K, V): Replace the value of the key K, with the new specified value V.
        9) replace(K, oldValue, newValue): Replaces the value of the key K with the new value newValue only if the key K
           is associated with the value oldValue.
        10) remove(K): Removes the entry from the map represented by the key K.
        11) remove(K, V): Removes the entry from the map that has key K associated with value V.
        12) keySet(): Returns a set of all the keys present in the map.
        13) values(): Returns a collection of all the values present in the map.
        14) entrySet(): Returns a set of all the key/value mapping present in a map.
         */

        Map<String, String> map = new HashMap<>();
        map.put("in", "India");
        map.put("us", "United States");
        map.put("il", "Israel");
        map.put("ru", "Russia");
        System.out.println(map);
        map.remove("us");
        System.out.println(map);
        System.out.println(map.containsKey("in"));

        map.putIfAbsent("in", "India India"); //Agar 'in' key present hai, to ye add nahi hoga.
        System.out.println(map);

        Set<String> keys = map.keySet();
        System.out.println(keys);
        //If we want keys as ArrayLists, we can do this:
        ArrayList<String> keysArray = new ArrayList<>(map.keySet());
        System.out.println(keysArray);

        Collection<String> values = map.values();
        System.out.println(values);

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey() + ", " + entry.getValue());

        }


    }
}
