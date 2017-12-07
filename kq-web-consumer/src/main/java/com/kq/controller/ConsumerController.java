package com.kq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    public ConsumerController() {
    }

    @RequestMapping(
            value = {"/ribbon"},
            method = {RequestMethod.GET}
    )
    public String helloConsumer() {
        return (String)this.restTemplate.getForEntity("http://HELLO-SERVICE/pms/query.do", String.class, new Object[0]).getBody();
    }
}