package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import java.util.Collections;
import java.util.Collection;

public class Example1 {

    public static void main(String[] args) {
        /**
         * TreeSet sorts elements based on the natural order of elements
         * All elements in treeSet must implement Comparable interface
         * All elements must be mutually comparable -> e1.compareTo(e2) */

        Set<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(220);
        integerTreeSet.add(4);
        integerTreeSet.add(17);
        integerTreeSet.add(1);
        integerTreeSet.add(5);

        System.out.println("treeset: " + integerTreeSet);

        Set<Integer> integerHashSetSet = new HashSet<>();

        integerHashSetSet.add(220);
        integerHashSetSet.add(4);
        integerHashSetSet.add(17);
        integerHashSetSet.add(1);
        integerHashSetSet.add(5);

        System.out.println("hashset: " + integerHashSetSet);

        Set<Integer> intLinkedHashSet= new LinkedHashSet<>();

        intLinkedHashSet.add(220);
        intLinkedHashSet.add(4);
        intLinkedHashSet.add(17);
        intLinkedHashSet.add(1);
        intLinkedHashSet.add(5);

        System.out.println("linkedHashSet: " + intLinkedHashSet);

    }
}
