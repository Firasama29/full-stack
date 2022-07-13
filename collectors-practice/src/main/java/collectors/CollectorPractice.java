package collectors;

import com.sun.javafx.collections.ImmutableObservableList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorPractice {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("toList", "toList", "toSet", "toMap", "toCollection");

        /** [toList, toList, toSet, toMap, toCollection] */
        //System.out.println("List, allows duplicates                        --> " + stringList.stream().collect(Collectors.toList()));

        /** [toSet, toCollection, toMap, toList] */
        //System.out.println("\nSet, automatically eliminates duplicates       --> " + stringList.stream().collect(Collectors.toSet()));

        /** [toSet=5, toCollection=12, toMap=5, toList=6] */
        //System.out.println("\nMap, eliminates duplicates                     --> " + stringList.stream().collect(Collectors.toMap(Function.identity(), String::length, (a, b) -> a)));

        /** [toList, toList, toSet, toMap, toCollection] */
        //System.out.println("\nLinkedList, insertion order, allows duplicates --> " + stringList.stream().collect(Collectors.toCollection(LinkedList::new)));

        /** [toList, toList, toSet, toMap, toCollection] */
        //System.out.println("\nArrayList, insertion order, allows duplicates  --> " + stringList.stream().collect(Collectors.toCollection(ArrayList::new)));

        /** [toSet, toCollection, toMap, toList] */
        //System.out.println("\nHashSet, eliminates duplicates                 --> " + stringList.stream().collect(Collectors.toCollection(HashSet::new)));

        /** [toList, toSet, toMap, toCollection] */
        //System.out.println("\nLinkedHashSet, insertion order, eliminates duplicates --> " + stringList.stream().collect(Collectors.toCollection(LinkedHashSet::new)));

        /** [toCollection, toList, toMap, toSet] */
        //System.out.println("\nTreeSet, natural order, eliminates duplicates --> " + stringList.stream().collect(Collectors.toCollection(TreeSet::new)));


        /** Optional[toCollection] */
        System.out.println("\nmaxBy(), returns biggest element according to Comparator    --> " + stringList.stream().collect(Collectors.maxBy(Comparator.comparing(String::length))));

        /** Optional[toSet] */
        System.out.println("\nminBy(), returns smallest element according to Comparator    --> " + stringList.stream().collect(Collectors.minBy(Comparator.comparing(String::length))));

        /** "toList, toList, toSet, toMap, toCollection" */
        System.out.println("\njoining() to concatenate elements into a string    --> " + stringList.stream().collect(Collectors.joining(", ")));

        /** 5 */
        System.out.println("\ncounting()    --> " + stringList.stream().collect(Collectors.counting()));

        /**groups elements based on certain property, for example, length of a string*/
        System.out.println("\ngroupingBy()    --> " + stringList.stream().collect(Collectors.groupingBy(String::length, Collectors.toSet())));

        /** elements based on certain property, for example, length of a string*/

        System.out.println("\ncollectingAndThen()    --> " + stringList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), ImmutableObservableList::new)));


    }
}
