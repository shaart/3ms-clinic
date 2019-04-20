package com.tms.platform.db.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "hello")
public class HelloEntity implements Serializable {

  @Id
  @GeneratedValue
  private Integer id;

  @Column(name = "name")
  private String name;
}
