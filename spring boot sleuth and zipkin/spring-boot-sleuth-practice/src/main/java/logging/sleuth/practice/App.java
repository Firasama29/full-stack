package logging.sleuth.practice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
    private static final String SPRING_PROPERTY_CONFIG = "spring.config.name=application,httpConnection";

    public static void main( String[] args )
    {
        new SpringApplicationBuilder().sources(App.class).properties(SPRING_PROPERTY_CONFIG).run(args);
    }
}
