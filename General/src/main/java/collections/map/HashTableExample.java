package collections.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args) {

        /** Hashtable is synchronized class */
        /** initial capacity = 11
         * default load factor = 0.75 */
        Hashtable<Integer, String> stringHashTable = new Hashtable<Integer, String>(20, 0.95f);

        stringHashTable.put(1, "Collection");
        stringHashTable.put(2, "List");
        stringHashTable.put(3, "Set");
        stringHashTable.put(4, "Map");

        System.out.println("hashtable: " + stringHashTable);

        System.out.println("hashtable get() method : " + stringHashTable.get(1));

        int stringHashCode = stringHashTable.hashCode();
        System.out.println("hashTable hashcode: " + stringHashCode);    // return hashcode: 254681332

        System.out.println("size = " + stringHashTable.size());

        System.out.println("keyset: " + stringHashTable.keySet());      // returns keys as a Set where duplication is not allowed: [4, 3, 2, 1]
        System.out.println("values: " + stringHashTable.values());      // returns values as collection where duplication is allowed [Map, Set, List, Collection]
        System.out.println("entryset: " + stringHashTable.entrySet());  // returns entrySet as Set<Map.Entry<K,V>>: [4=Map, 3=Set, 2=List, 1=Collection]

        System.out.println("forEach: ");
        stringHashTable.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("for loop: ");
        for(Map.Entry<Integer, String> entry : stringHashTable.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
