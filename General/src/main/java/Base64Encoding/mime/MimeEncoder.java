package Base64Encoding.mime;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class MimeEncoder {

    public static void main(String[] args) {

        StringBuilder stringBuilder = getMimeBuilder();
        System.out.println("original: " + stringBuilder);

        /** encoding MIME */
        byte[] encodedAsBytes = stringBuilder.toString().getBytes(StandardCharsets.UTF_8);

        String encodedMime = Base64.getMimeEncoder().encodeToString(encodedAsBytes);

        System.out.println("\nencoded MIME: " + encodedMime);

        /** decoding MIME */
        byte[] deocdedAsByte = Base64.getMimeDecoder().decode(encodedMime);

        String decodedMIME = new String(deocdedAsByte);
        System.out.println("\ndecoded MIME: " + decodedMIME);


    }

    public static StringBuilder getMimeBuilder() {
        StringBuilder stringBuilder = new StringBuilder();

        for(int count = 0; count < 10; ++count) {
            stringBuilder.append(UUID.randomUUID().toString());
        }
        return stringBuilder;
    }
}
