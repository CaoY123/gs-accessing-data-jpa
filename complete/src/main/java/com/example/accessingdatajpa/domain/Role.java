package com.example.accessingdatajpa.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author CaoY
 * @date 2022-12-26 0:11
 * @description 用于学习多对多实体类的构建
 */
@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String roleName;
}
