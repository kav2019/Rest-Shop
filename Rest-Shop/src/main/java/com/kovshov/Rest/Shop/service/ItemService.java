package com.kovshov.Rest.Shop.service;

import com.kovshov.Rest.Shop.model.Item;
import com.kovshov.Rest.Shop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
}