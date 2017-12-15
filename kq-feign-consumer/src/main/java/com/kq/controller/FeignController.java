package com.kq.controller;

import com.kq.service.HelloServceFeign;
import com.kq.service.HelloService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    HelloServceFeign helloServceFeign;

    @Autowired
    HelloService2 helloService2;

    //注意必须有value
    @RequestMapping(value = "feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloServceFeign.hello();
    }



    @RequestMapping(value = "feign_consumer2",method = RequestMethod.GET)
    public String helloConsumer2(){
        return helloService2.hello("我是老王。。");
    }
}
