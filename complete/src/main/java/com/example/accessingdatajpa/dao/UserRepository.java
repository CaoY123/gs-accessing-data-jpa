package com.example.accessingdatajpa.dao;

import com.example.accessingdatajpa.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author CaoY
 * @date 2022-12-25 23:10
 * @description 关于User接口的持久化接口编写
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
