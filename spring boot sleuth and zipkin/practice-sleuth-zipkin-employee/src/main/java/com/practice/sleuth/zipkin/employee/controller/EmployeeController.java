package com.practice.sleuth.zipkin.employee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    Logger log = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/first")
    public String printEmployeeMessage() {
        log.info("inside employee microservice");
        String response = restTemplate.getForObject("http://localhost:8081/task/second", String.class);

        log.info("employee service response" + response);

        return "from employee service";
    }


}
