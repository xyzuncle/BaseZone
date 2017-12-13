package com.kq.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService(){
        return this.restTemplate.getForEntity("http://HELLO-SERVICE/pms/query.do", String.class, new Object[0]).getBody();
    }

    public String helloFallback(){
        return "error";
    }
}
