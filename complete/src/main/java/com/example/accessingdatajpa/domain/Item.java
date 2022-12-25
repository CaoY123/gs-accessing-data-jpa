package com.example.accessingdatajpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author CaoY
 * @date 2022-12-25 23:51
 * @description 一对多，一个item对应多个itemDetails
 */
@Data
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String itemName;

    @JoinColumn(name = "itemId")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ItemDetail> detailList;
}
