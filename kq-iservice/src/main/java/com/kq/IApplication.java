package com.kq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;



@SpringBootApplication
public class IApplication
{
    public static void main(String[] args)
    {
        new SpringApplicationBuilder(new Object[] { IApplication.class }).web(true).run(args);
    }
}