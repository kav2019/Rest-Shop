package com.kovshov.Rest.Shop.facade;

import com.kovshov.Rest.Shop.dto.ItemDTO;
import com.kovshov.Rest.Shop.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemFacade {
    public ItemDTO itemToItemDTO(Item item){
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setTitle(item.getTitle());
        itemDTO.setDescription(item.getDescription());
        itemDTO.setCompany(item.getCompanyToString());
        itemDTO.setPrice(item.getPrice());
        itemDTO.setQuantiy(item.getQuantiy());
        itemDTO.setDiscount(item.getDiscount());
        itemDTO.setReview(item.getReview());
        itemDTO.setKeywords(item.getKeywords());
        itemDTO.setParametrs(item.getParametrs());
        itemDTO.setOwner(item.getOwnerToListString());
        return itemDTO;
    }

}
