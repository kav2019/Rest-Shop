package com.kovshov.Rest.Shop.controllers;

import com.kovshov.Rest.Shop.dto.CompanyDTO;
import com.kovshov.Rest.Shop.dto.ItemDTO;
import com.kovshov.Rest.Shop.facade.ItemFacade;
import com.kovshov.Rest.Shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    private final ItemService itemService;
    private final ItemFacade itemFacade;

    @Autowired
    public ItemController(ItemService itemService, ItemFacade itemFacade) {
        this.itemService = itemService;
        this.itemFacade = itemFacade;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ItemDTO>> getAllItems(){
        List<ItemDTO> itemDTOList = itemService.getAllItems()
                .stream()
                .map(itemFacade::itemToItemDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(itemDTOList, HttpStatus.OK);
    }
}
