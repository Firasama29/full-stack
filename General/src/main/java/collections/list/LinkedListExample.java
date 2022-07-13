package collections.list;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        /** purpose of this list is to add it to our linkedlist using addAll() method */
        List<Integer> tempLinkedList = Arrays.asList(15, 24, 15, 32);

        /** add */
        linkedList.add(10);
        linkedList.add(30);
        linkedList.add(17);
        linkedList.add(28);
        linkedList.add(21);

        /** add element based on index */
        linkedList.add(2, 20);

        /** add first or last */
        linkedList.addFirst(0);
        linkedList.addLast(1000);
        System.out.println("addFirst() and addLast() methods: " + linkedList);  //[0, 10, 30, 20, 17, 28, 21, 1000]

        /** retrieve */
        System.out.println("get by index: " + linkedList.get(1));   //10

        /** set() method */
        System.out.println("update element with set() method by index: " + linkedList.set(4, 400));

        /** get size */
        System.out.println("size: " + linkedList.size());   //8

        /** check if empty */
        System.out.println("empty or not: " + linkedList.isEmpty());    //false

        /** add multiple elements */
        linkedList.addAll(tempLinkedList);
        System.out.println("new linkedList using addAll(Collection): " + linkedList);   //[0, 10, 30, 20, 17, 28, 21, 1000, 15, 24, 15, 32]

        linkedList.addAll(5, tempLinkedList);
        System.out.println("new linkedList using addAll(index, Collection): " + linkedList); //[0, 10, 30, 20, 17, 15, 24, 15, 32, 28, 21, 1000, 15, 24, 15, 32]
    }
}
