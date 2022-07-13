package Base64Encoding.url;

import java.util.Base64;

public class Url {

    public static void main(String[] args) {
        String url = "https://www.baeldung.com/java-base64-encode-and-decode";

        System.out.println("Original text: " + url);

        /** encoding url string */

        String encodedUrl = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println("encoded url: " + encodedUrl);

        /** decoding url to string */

        byte[] decodedUrlBytes = Base64.getDecoder().decode(encodedUrl);

        String decodedUrlString = new String(decodedUrlBytes);
        System.out.println("decoded url: " + decodedUrlString);
    }
}
