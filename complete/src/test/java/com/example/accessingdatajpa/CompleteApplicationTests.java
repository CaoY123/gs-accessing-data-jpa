package com.example.accessingdatajpa;

import com.example.accessingdatajpa.dao.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 要注意测试的时候测试的文件夹的包目录与根项目目录一样
@SpringBootTest
class CompleteApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    // 测试一对多的映射 Item(一) - ItemDetail(多)
    @Test
    public void testItemRepository() {

        System.out.println(itemRepository);
    }

    @Test
    void contextLoads() {
    }

}
