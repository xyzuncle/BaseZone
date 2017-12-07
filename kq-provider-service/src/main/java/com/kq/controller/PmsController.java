package com.kq.controller;

import java.io.PrintStream;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/pms"})
public class PmsController
{
    private final Logger logger;

    @Qualifier("discoveryClient")
    @Autowired
    private DiscoveryClient client;

    public PmsController()
    {
        this.logger = Logger.getLogger(String.valueOf(super.getClass()));
    }

    @RequestMapping(value={"/query.do"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    String queryByID()
    {
        ServiceInstance instance = this.client.getLocalServiceInstance();
        System.out.println("host:  " + instance.getHost() + "Port " + instance.getPort() + "service id :" + instance
                .getServiceId());

        return "hello word";
    }
}