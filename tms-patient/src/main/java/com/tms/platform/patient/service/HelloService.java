package com.tms.platform.patient.service;

import com.tms.platform.common.dto.HelloDto;
import com.tms.platform.common.feign.HelloClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloService {

  private final HelloClient helloClient;

  public HelloDto getHello(String id) {
    return helloClient.getHello(id);
  }
}
