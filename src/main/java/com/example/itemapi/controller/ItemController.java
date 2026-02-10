package com.example.itemapi.controller;

import com.example.itemapi.model.Item;
import com.example.itemapi.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List; // ✅ REQUIRED IMPORT

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @PostMapping
    public Item addItem(@Valid @RequestBody Item item) {
        return service.addItem(item);
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable Long id) {
        return service.getItem(id);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return service.getAllItems();
    }
}
