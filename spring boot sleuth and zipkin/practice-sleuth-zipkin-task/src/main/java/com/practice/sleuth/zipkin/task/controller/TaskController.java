package com.practice.sleuth.zipkin.task.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/task")
public class TaskController {

    Logger log = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/second")
    public String printTaskMessage() {
        log.info("inside task service");
        String response = restTemplate.getForObject("http://localhost:8082/sprint/third", String.class);
        log.info("task service response" + response);
        return "this message is from task service";
    }
}
