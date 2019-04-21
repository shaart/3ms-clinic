package com.tms.platform.patient.controller;

import com.tms.platform.common.dto.HelloDto;
import com.tms.platform.patient.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hi")
@RestController
@RequiredArgsConstructor
public class HelloController {

  private final HelloService helloService;

  @GetMapping("/{id}")
  public HelloDto getHello(@PathVariable String id) {
    return helloService.getHello(id);
  }
}
