package com.kq.controller;

import com.kq.service.HelloServceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    HelloServceFeign helloServceFeign;
    //注意必须有value
    @RequestMapping(value = "feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloServceFeign.hello();
    }
}
