package com.kovshov.Rest.Shop.facade;

import com.kovshov.Rest.Shop.dto.ItemDTO;
import com.kovshov.Rest.Shop.dto.OrderDTO;
import com.kovshov.Rest.Shop.model.Item;
import com.kovshov.Rest.Shop.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderFacade {
    public OrderDTO orderToOrderDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setUser(order.getUserAsString());
        orderDTO.setItem(order.getItemAsString());
        orderDTO.setDateCreate(order.getDateCreate());
        return orderDTO;
    }
}
