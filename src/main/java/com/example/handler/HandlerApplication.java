package com.example.handler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class HandlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandlerApplication.class, args);
    }

}

