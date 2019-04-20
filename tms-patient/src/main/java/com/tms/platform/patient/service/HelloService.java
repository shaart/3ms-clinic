package com.tms.platform.patient.service;

import com.tms.platform.common.dto.HelloDto;
import com.tms.platform.common.feign.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

  @Autowired
  private HelloClient helloClient;

  public HelloDto getHello(int id) {
    return helloClient.getHello(id);
  }

}
