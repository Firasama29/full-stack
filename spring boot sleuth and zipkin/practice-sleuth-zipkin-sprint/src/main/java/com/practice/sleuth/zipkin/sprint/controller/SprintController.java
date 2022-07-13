package com.practice.sleuth.zipkin.sprint.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/sprint")
public class SprintController {

    Logger log = LoggerFactory.getLogger(SprintController.class);

    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/third")
    public String printTaskMessage() {
        log.info("inside task service");
        return "this message is from sprint service";
    }
}
