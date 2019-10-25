package com.wn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerRegister1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerRegister1Application.class, args);
    }

}
