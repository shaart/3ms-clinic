package com.tms.platform.db.service;

import com.tms.platform.db.repository.HelloEntity;
import com.tms.platform.db.repository.HelloWorldRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    private HelloWorldRepo repository;

    @Autowired
    public HelloWorldService(HelloWorldRepo repository){
        this.repository = repository;
    }

    public HelloEntity getHelloEntityById(Integer id){

        return repository.findById(id).orElseThrow(RuntimeException::new);
    }
}
