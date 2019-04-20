package com.tms.platform.db.controller;

import com.tms.platform.db.repository.HelloEntity;
import com.tms.platform.db.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    private HelloWorldService service;

    @Autowired
    public HelloWorldController (HelloWorldService service){
        this.service = service;
    }

    @GetMapping("/hello/{id}")
    public HelloEntity greeting (@PathVariable(name = "id") Integer id){

        return service.getHelloEntityById(id);
    }

}
