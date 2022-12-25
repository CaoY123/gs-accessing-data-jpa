package com.example.accessingdatajpa.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author CaoY
 * @date 2022-12-25 23:00
 * @description
 */
@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
}
