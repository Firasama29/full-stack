package com.practice.sleuth.zipkin.task.config;

import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class TaskConfig {

    /**
     * collect data from sleuth and provide it to zipkin client
     */
    @Bean
    public Sampler collectLogs() {
        return Sampler.ALWAYS_SAMPLE;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
