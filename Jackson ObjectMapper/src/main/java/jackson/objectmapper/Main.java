package jackson.objectmapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Practice practice = new Practice("objectMapper test", "firas");

        //writeValue() method serializes Practice object into a json string and save it in a json file
        objectMapper.writeValue(new File("test.json"), practice);

        //writeValueAsString() generates json from java object and returns it as a string
//        String jsonAsString = objectMapper.writeValueAsString(practice);
//        System.out.println(jsonAsString);

        //readValue() method to convert json string into java object
        String json = "{\"from\":\"json\",\"to\":\"object\"}";
//        Practice practice1 = objectMapper.readValue(json, Practice.class);
        Practice practice2 = objectMapper.readValue(new File("test.json"), Practice.class);
        //Practice practice3 = objectMapper.readValue(new URL("file:src/test/resources/json_car.json"), Practice.class);
//        System.out.println(practice2);

        //parse a json into a json node object to retrieve data of a single node
        String jsonString = "{\"from\":\"json\",\"to\":\"node\"}";
        JsonNode jsonNode = objectMapper.readTree(jsonString).get("name");
//        System.out.println(jsonNode);

        //or convert json node object into a string
//        String name = jsonNode.toString();
//        System.out.println(name);

        //parse a json string into a java list
        String jsonToList = "[{\"name\":\"json\",\"author\":\"list\"}]";
        List<Practice> practiceList = objectMapper.readValue(jsonToList, new TypeReference<List<Practice>>(){});
//        System.out.println(practiceList);

        //parse a json string into a java map
        String jsonToMap = "[{\"name\":\"json\",\"author\":\"list\"}]";
        Map<String, Object> practiceMap = objectMapper.readValue(jsonToMap, new TypeReference<Map<String, Object>>(){});
//        System.out.println(practiceMap);



    }
}
