package com.example.accessingdatajpa;

import com.example.accessingdatajpa.dao.ItemRepository;
import com.example.accessingdatajpa.domain.Item;
import com.example.accessingdatajpa.domain.ItemDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author CaoY
 * @date 2022-12-25 23:57
 * @description
 */
@SpringBootTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void testSave() {
        Item item = new Item();
        item.setItemName("计算机技术书籍订单2");
        ItemDetail itemDetail1 = new ItemDetail();
        itemDetail1.setItemDetailName("C++基础");
        ItemDetail itemDetail2 = new ItemDetail();
        itemDetail2.setItemDetailName("QT");
        ItemDetail itemDetail3 = new ItemDetail();
        itemDetail3.setItemDetailName("计算机网络");
        item.setDetailList(Arrays.asList(itemDetail1, itemDetail2, itemDetail3));
        itemRepository.save(item);
    }

    @Test
    public void testFind() {
        Optional<Item> optional = itemRepository.findById(1);
        Item item = optional.get();
        System.out.println(item);
    }

    @Test
    public void testUpdate() {
        Item item = new Item();
        item.setId(1);
        item.setItemName("计算机工具书籍");
        itemRepository.save(item);
    }

    @Test
    public void testDelete() {
        Item item = new Item();
        item.setId(1);
        itemRepository.delete(item);
    }
}
