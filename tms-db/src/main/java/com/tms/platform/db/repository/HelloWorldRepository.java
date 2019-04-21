package com.tms.platform.db.repository;

import com.tms.platform.db.entity.HelloEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepository extends MongoRepository<HelloEntity, String> {

  HelloEntity findByName(String name);
}
