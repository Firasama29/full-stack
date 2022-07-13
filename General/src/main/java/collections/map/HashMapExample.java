package collections.map;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        /** HashMap is an asynchronous class (not thread-safe)
         * HashMap allows one null key and null values
         * no insertion order */
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(100, "ArrayList");
        hashMap.put(200, "LinkedList");
        hashMap.put(300, "HashSet");
        hashMap.put(400, "LinkedHashSet");
        hashMap.put(500, "HashTable");
        hashMap.put(600, "HashMap");

        System.out.println("hashmap: " + hashMap);

        System.out.println("entrySet: " + hashMap.entrySet());  // returns a Set<Map.Entry<Integer, String>>

        System.out.println("keySet: " + hashMap.keySet());  // //returns a Set where duplication isn't allowed

        System.out.println("values: " + hashMap.values());

    }
}
