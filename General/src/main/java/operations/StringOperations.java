package operations;

import java.util.Arrays;
import java.util.Objects;

public class StringOperations {
    /** convert a string text into a string array
     - first, remove whitespaces from the text
     - convert into an array
     */
    public static void main(String[] args) {
        String stringInput  = "This string will be converted into an array of strings";
        String stringWithoutSpaces = stringInput.replaceAll("\\s", "");

        String[] stringArray = stringWithoutSpaces.split("");

        System.out.print(Arrays.toString(stringArray));

    }
}
