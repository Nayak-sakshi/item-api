package com.example.itemapi.repository;

import com.example.itemapi.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepository {

    private final List<Item> items = new ArrayList<>();
    private Long id = 1L;

    public Item save(Item item) {
        item.setId(id++);
        items.add(item);
        return item;
    }

    public Item findById(Long id) {
        return items.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // ✅ ADD THIS
    public List<Item> findAll() {
        return items;
    }
}
