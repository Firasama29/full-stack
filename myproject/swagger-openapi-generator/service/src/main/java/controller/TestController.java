package controller;

import com.practice.api.TestApi;
import com.practice.api.TestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/practice")
public class TestController implements TestApi {

    @Override
    public ResponseEntity<TestResponse> testGet(String id) {
        return null;
    }
}
