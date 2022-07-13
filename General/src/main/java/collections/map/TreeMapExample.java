package collections.map;

import collections.Example;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(4, "LinkedHashMap");
        treeMap.put(2, "HashTable");
        treeMap.put(5, "TreeMap");
        treeMap.put(1, "Map");
        treeMap.put(3, "HashMap");

        System.out.println("treemap in default natural order: " + treeMap);
        System.out.println("treeMap in descending order: " + treeMap.descendingMap());
        System.out.println("treeMap in descending order: " + treeMap.descendingMap());
        System.out.println("first entry: " + treeMap.firstEntry());
        System.out.println("last entry: " + treeMap.lastEntry());
        System.out.println("lower entry: " + treeMap.lowerEntry(5));
        System.out.println("comparator: " + treeMap.comparator());
        System.out.println("headMap: " + treeMap.headMap(3));
        System.out.println("tailMap: " + treeMap.tailMap(3));
        System.out.println("\ntreemap entries: " + treeMap.entrySet());
        System.out.println("treemap keys: " + treeMap.keySet());
        System.out.println("treemap values: " + treeMap.values());

        TreeMap<Integer, Example> treeMap1 = new TreeMap<>(Comparator.comparing(Integer::new));

        treeMap1.put(10, new Example(1, "Example treeMap"));
        treeMap1.put(30, new Example(1, "custom comparator"));
        treeMap1.put(20, new Example(1, "treeMap with comparator"));
        treeMap1.put(40, new Example(1, "Object and treeMap"));
        System.out.println("\n new treeMap: " + treeMap1);

    }
}
