package collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        /** LinkedHashMap extends HashMap and implements Map
         * LinkedHashMap maintains insertion order
         * LinkedHashMap can be configured to return elements in access order
         * initial capacity = 16 and load factor = 0.75 */
        LinkedHashMap<Integer, String> linkedHashMapInsertionOrder = new LinkedHashMap<>();

        linkedHashMapInsertionOrder.put(null, "String");
        linkedHashMapInsertionOrder.put(2, null);
        linkedHashMapInsertionOrder.put(3, null);
        linkedHashMapInsertionOrder.put(4, "Double");
        linkedHashMapInsertionOrder.put(5, "Long");
        System.out.println("default insertion order: " + linkedHashMapInsertionOrder);


        /** here we configured the access order by adding parameter true
         * which orders the elements from least-recently accessed to most-recently accessed element
         * in other words, any access operation on the map results in an order in which an element that was recently accessed will
         * be added last in the map */
        LinkedHashMap<Integer, String> linkedHashMapAccessOrder = new LinkedHashMap<>(16, 0.75f, true);

        linkedHashMapAccessOrder.putAll(linkedHashMapInsertionOrder);

        System.out.println("get an element to trigger access order: " + linkedHashMapAccessOrder.get(2));
        System.out.println("configured access order: " + linkedHashMapAccessOrder);
    }
}
