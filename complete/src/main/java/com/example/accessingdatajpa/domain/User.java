package com.example.accessingdatajpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author CaoY
 * @date 2022-12-25 22:57
 * @description
 */
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String sex;

    private Date birthDay;

    @JoinColumn(name = "account_id")
    @OneToOne(cascade = CascadeType.ALL)
    private  Account account;

    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Role> roleList;
}
