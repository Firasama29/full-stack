package Base64Encoding.basic;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class Basic {

    //Encode and decode using Base64

    public static void main(String[] args) {
        /** original text */
        String original = "Testing Base64 encoding and decoding";

        System.out.println("Original text: " + original);


        /** encoded text */
        String encodedString = Base64.getEncoder().encodeToString(original.getBytes(StandardCharsets.UTF_8));

        String encodedWithoutPadding = Base64.getEncoder().withoutPadding().encodeToString(original.getBytes(StandardCharsets.UTF_8));

        System.out.println("Encoded text: " + encodedString);
        System.out.println("Encoded text without padding: " + encodedWithoutPadding);


        /** decoded text */
        byte[] asBytes = Base64.getDecoder().decode(encodedString);

        String decodedString = new String(asBytes, StandardCharsets.UTF_8);

        System.out.println("Decoded text: " + decodedString);
    }
}
