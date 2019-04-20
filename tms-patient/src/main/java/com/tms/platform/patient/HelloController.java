package com.tms.platform.patient;

import com.tms.platform.common.dto.HelloDto;
import com.tms.platform.patient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hi")
@RestController
public class HelloController {

  @Autowired
  private HelloService helloService;

  @GetMapping("/{id}")
  public HelloDto getHello(@PathVariable int id) {
    return helloService.getHello(id);
  }
}
