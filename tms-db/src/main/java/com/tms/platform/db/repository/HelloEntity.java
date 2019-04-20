package com.tms.platform.db.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "hello")
public class HelloEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;
}
