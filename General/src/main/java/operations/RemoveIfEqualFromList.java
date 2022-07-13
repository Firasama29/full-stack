package operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveIfEqualFromList {

    public static void main(String[] args) {

        /** remove elements from list using equals() */

        List<Double> listOfDoubles = new ArrayList<>(Arrays.asList(1.1, 45.6, 1.0, 9.65, 1.0, 1.0));

        System.out.println("original list: " + listOfDoubles);

        listOfDoubles.removeIf(d -> d.equals(1.0));

        System.out.println("\nremoved elements that are equal to 1.0: " + listOfDoubles);

    }
}
