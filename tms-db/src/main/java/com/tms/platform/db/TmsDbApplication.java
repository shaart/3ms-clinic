package com.tms.platform.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TmsDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsDbApplication.class, args);
    }

}
