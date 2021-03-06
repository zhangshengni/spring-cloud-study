package com.study.client.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    private static final String HELLO_SERVICE = "http://localhost:8762/";

    @GetMapping("hello")
    public String hello() {
        return restTemplate.getForEntity(HELLO_SERVICE, String.class).getBody();
    }
}