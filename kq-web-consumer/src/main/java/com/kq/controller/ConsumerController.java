package com.kq.controller;

import com.kq.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    public ConsumerController() {
    }

    @RequestMapping(
            value = {"/ribbon"},
            method = {RequestMethod.GET}
    )
    public String helloConsumer() {
        return helloService.helloService();
    }
}