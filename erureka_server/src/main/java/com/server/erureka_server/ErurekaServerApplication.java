package com.server.erureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErurekaServerApplication.class, args);
    }
}
