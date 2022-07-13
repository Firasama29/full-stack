package collectors;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapCollector {

    public static void main(String[] args) {
        List<Example> exampleList = new ArrayList<>();
        exampleList.add(new Example(2, "second"));
        exampleList.add(new Example(4, "fourth"));
        exampleList.add(new Example(1, "first"));
        exampleList.add(new Example(3, "third"));
        Map<Integer, String> map1 = exampleList.stream().collect(Collectors.toMap(Example::getId, Example::getName));

        //{1=first, 2=second, 3=third, 4=fourth}
        System.out.println("result Map                              --> " + map1);
        //System.out.println("result HashMap   --> " + exampleList.stream().collect(Collectors.toCollection(HashMap::new, Example::getName, Example::getId)));
        //System.out.println("result TreeMap   --> " + exampleList.stream().collect(Collectors.toMap(Example::getName, Example::getId)));

        List<Example> duplicateCollection = new ArrayList<>();
        duplicateCollection.add(new Example(2, "second"));
        duplicateCollection.add(new Example(4, "fourth"));
        duplicateCollection.add(new Example(1, "first"));
        duplicateCollection.add(new Example(3, "third"));
        duplicateCollection.add(new Example(2, "duplicate"));

        Map<Integer, String> map2 = duplicateCollection.stream().collect(Collectors.toMap(Example::getId, Example::getName, (a, b) -> b));
        Map<Integer, Example> map = duplicateCollection.stream().collect(Collectors.toMap(Example::getId, Function.identity(), (a, b) -> b));
        Map<Integer, String> hashMap = duplicateCollection.stream().collect(Collectors.toMap(Example::getId, Example::getName, (a, b) -> b, HashMap::new));
        Map<String, Integer> treeMap = duplicateCollection.stream().collect(Collectors.toMap(Example::getName, Example::getId, (a, b) -> b, TreeMap::new));
        Map<Integer, String> linkedHashMap = duplicateCollection.stream().collect(Collectors.toMap(Example::getId, Example::getName, (a, b) -> b, LinkedHashMap::new));
        Map<Integer, String> hashTable = duplicateCollection.stream().collect(Collectors.toMap(Example::getId, Example::getName, (a, b) -> b, Hashtable::new));
        Map<Integer, String> concurrentHashMap = duplicateCollection.stream().collect(Collectors.toMap(Example::getId, Example::getName, (a, b) -> b, ConcurrentHashMap::new));

        //{1=first, 2=duplicate, 3=third, 4=fourth}
        System.out.println("toMap to handle duplicate elements      --> " + map2);
        System.out.println("\ntoMap to handle duplicate elements      --> " + map);
        System.out.println("\nreturn a hashMap                        --> " + hashMap);
        System.out.println("\nreturn a TreeMap (natural order)        --> " + treeMap);
        System.out.println("\nreturn a LinkedHashMap                  --> " + linkedHashMap);
        System.out.println("\nreturn a HashTable                      --> " + hashTable);
        System.out.println("\nreturn a ConcurrentHashMap              --> " + concurrentHashMap);
    }

}


class Example {
    private int id;
    private String name;

    public Example(){};
    public Example(int id, String name) {
        this.id  = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
