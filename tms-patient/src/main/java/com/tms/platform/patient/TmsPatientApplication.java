package com.tms.platform.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients("com.tms.platform.common.feign")
@SpringBootApplication
public class TmsPatientApplication {

  public static void main(String[] args) {
    SpringApplication.run(TmsPatientApplication.class, args);
  }

}
