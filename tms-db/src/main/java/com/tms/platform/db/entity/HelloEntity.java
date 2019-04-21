package com.tms.platform.db.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor
@Getter
@Setter
@Document(collection = "patient")
public class HelloEntity implements Serializable {

  public HelloEntity(String name) {
    this.name = name;
  }

  @Id
  private String id;

  private String name;
}
