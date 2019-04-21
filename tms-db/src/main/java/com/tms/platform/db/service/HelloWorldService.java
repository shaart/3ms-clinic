package com.tms.platform.db.service;

import com.tms.platform.common.dto.HelloDto;
import com.tms.platform.db.entity.HelloEntity;
import com.tms.platform.db.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

  private HelloWorldRepository repository;

  @Autowired
  public HelloWorldService(HelloWorldRepository repository) {
    this.repository = repository;
  }

  public HelloDto getHelloEntityById(String id) {

    HelloEntity helloEntity = repository.findById(id).orElseThrow(RuntimeException::new);
    HelloDto helloDto = new HelloDto();
    helloDto.setId(helloEntity.getId());
    helloDto.setName(helloEntity.getName());
    return helloDto;
  }

  public HelloDto getHelloEntityByName(String name) {

    HelloEntity helloEntity = repository.findByName(name);
    HelloDto helloDto = new HelloDto();
    helloDto.setId(helloEntity.getId());
    helloDto.setName(helloEntity.getName());
    return helloDto;
  }
}