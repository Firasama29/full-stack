package operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullFromList {

    public static void main(String[] args) {

        /** remove null values from an existing list using lambda expression and method reference and print the output
         * of the updated list
         */
        List<String> listOfStrings = new ArrayList<>(Arrays.asList("1", null, "something", null, null, "word", null));
        System.out.println("original string list: " + listOfStrings);
        listOfStrings.removeIf(n -> Objects.isNull(n));

        System.out.println("\n- list after removing null values using lambda expression: " + listOfStrings);

        listOfStrings.removeIf(Objects::isNull);
        System.out.println("\n- list after removing nulls using method reference: " + listOfStrings);

        /** filter null values using stream().filter() method and print the output in a new list */

        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(56, null, null, 43, 32, 6467, null));
        System.out.println("\noriginal integer list: " + listOfIntegers);

        List<Integer> newListLambda = listOfIntegers.stream().filter(n -> Objects.isNull(n)).collect(Collectors.toList());
        List<Integer> newListMethodReference = listOfIntegers.stream().filter(Objects::isNull).collect(Collectors.toList());

        System.out.println("\n- removed null values using filter() and lambda expression: " + newListLambda);
        System.out.println("\n- removed null values using filter() and method reference: " + newListMethodReference);
    }
}
