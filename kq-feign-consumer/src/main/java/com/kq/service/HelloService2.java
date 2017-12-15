package com.kq.service;

import com.kq.iservice.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("hello-service")
public interface HelloService2 extends HelloService{

}
