package com.kq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MybatisApplication
{
    public static void main(String[] args)
    {
        new SpringApplicationBuilder(new Object[] { MybatisApplication.class }).web(true).run(args);
    }
}