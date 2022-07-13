package collections.set;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        /** default capacity = 16
         * default load factor = 0.75
         * doesn't gaurantee constant order
         * null element allowed */
        HashSet<String> stringHashSet = new HashSet<>();
        System.out.println("hashSet with default capacity and load factor: " + stringHashSet);

        /** configure  default capacity load factor */
        HashSet<String> modified = new HashSet<>(100, 0.95f);
        System.out.println("hashSet with modified capacity and load factor: " + modified);

    }
}
