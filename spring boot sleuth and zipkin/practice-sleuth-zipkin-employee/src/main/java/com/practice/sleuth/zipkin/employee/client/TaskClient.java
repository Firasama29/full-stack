package com.practice.sleuth.zipkin.employee.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "TaskClient", url = "${employee.task.service.url}")
public interface TaskClient {

//    @GetMapping
//    TaskResponse getTask();
}
