package com.kq.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//绑定了web端的hello-service的service
//这里不区分大小写，在绑定别人的服务提供的服务名字时候
@FeignClient("hello-service")
public interface HelloServceFeign {
    //这里的/pms/query.do 是服务提供这
    // hello-sercer的 controller的访问路径
    // 同时可以带参数和不带参数的访问
    @RequestMapping("/pms/query.do")
    String hello();
}
