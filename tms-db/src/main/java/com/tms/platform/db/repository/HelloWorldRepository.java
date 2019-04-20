package com.tms.platform.db.repository;

import com.tms.platform.db.entity.HelloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepository extends JpaRepository<HelloEntity, Integer> {

  HelloEntity findByName(String name);
}
