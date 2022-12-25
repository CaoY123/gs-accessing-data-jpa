package com.example.accessingdatajpa.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author CaoY
 * @date 2022-12-25 23:53
 * @description
 */
@Data
@Entity
@Table(name = "item_detail")
public class ItemDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String itemDetailName;

    private Integer itemId;
}
