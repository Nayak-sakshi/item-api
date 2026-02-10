package com.example.itemapi.service;

import com.example.itemapi.model.Item;
import com.example.itemapi.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List; // ✅ REQUIRED IMPORT

@Service
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public Item addItem(Item item) {
        return repository.save(item);
    }

    public Item getItem(Long id) {
        return repository.findById(id);
    }

    // ✅ Get all items
    public List<Item> getAllItems() {
        return repository.findAll();
    }
}
