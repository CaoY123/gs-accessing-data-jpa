package com.example.accessingdatajpa.dao;

import com.example.accessingdatajpa.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author CaoY
 * @date 2022-12-25 23:57
 * @description
 */
@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
}
