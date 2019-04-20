package com.tms.platform.db.controller;

import com.tms.platform.common.dto.HelloDto;
import com.tms.platform.db.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  private HelloWorldService service;

  @Autowired
  public HelloWorldController(HelloWorldService service) {
    this.service = service;
  }

  @GetMapping("/hello/{id}")
  public HelloDto greeting(@PathVariable(name = "id") Integer id) {

    return service.getHelloEntityById(id);
  }
}
