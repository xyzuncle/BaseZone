package com.kq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CenterApplication {
    public CenterApplication() {
    }

    public static void main(String[] args) {
        (new SpringApplicationBuilder(new Object[]{CenterApplication.class})).web(true).run(args);
    }
}