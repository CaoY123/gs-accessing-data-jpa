package com.example.accessingdatajpa.dao;

import com.example.accessingdatajpa.dao.UserRepository;
import com.example.accessingdatajpa.domain.Account;
import com.example.accessingdatajpa.domain.Role;
import com.example.accessingdatajpa.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

/**
 * @author CaoY
 * @date 2022-12-25 23:12
 * @description
 */
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave() {
        User user = new User();
        user.setName("赵六");
        user.setSex("女");
        user.setBirthDay(new Date());
        Account account = new Account();
//        account.setId(1);
        account.setUsername("赵六");
        account.setPassword("zl");
        user.setAccount(account);
        Role role1 = new Role();
        role1.setRoleName("老师");
        Role role2 = new Role();
        role2.setRoleName("学生");
        Role role3 = new Role();
        role3.setRoleName("厨师");
        user.setRoleList(Arrays.asList(role1, role2, role3));
        userRepository.save(user);
    }

    @Test
    @Transactional(readOnly = true)
    public void testGet() {

        Optional<User> user = userRepository.findById(2);
        System.out.println(user);
//        int a = 2;
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(2);
        user.setName("王五大");
        user.setSex("男");
        user.setBirthDay(new Date(2022,12,25, 15,19,22));
        Account account = new Account();
        account.setId(2);
        account.setUsername("王五大");
        account.setPassword("123");
        user.setAccount(account);
        userRepository.save(user);
    }

    @Test
    public void testDelete() {
        Optional<User> user = userRepository.findById(3);
//        System.out.println(user);
        User user1 = user.get();
        userRepository.delete(user1);
    }



}
