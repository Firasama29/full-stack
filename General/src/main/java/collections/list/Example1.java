package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        /**
         * In terms of behavior, ArrayList and LinkedList maintain insertion order / order returned by collection iterator
         * */
        List<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(220);
        integerArrayList.add(4);
        integerArrayList.add(17);
        integerArrayList.add(1);
        integerArrayList.add(5);

        System.out.println("arrayList: " + integerArrayList);

        List<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.add(220);
        integerLinkedList.add(4);
        integerLinkedList.add(17);
        integerLinkedList.add(1);
        integerLinkedList.add(5);

        System.out.println("linkedList: " + integerLinkedList);
    }
}
