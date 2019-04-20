package com.tms.platform.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepo extends JpaRepository<HelloEntity, Integer> {

    HelloEntity findByName(String name);
}
