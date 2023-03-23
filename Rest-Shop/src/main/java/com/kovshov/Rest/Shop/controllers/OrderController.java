package com.kovshov.Rest.Shop.controllers;

import com.kovshov.Rest.Shop.dto.OrderDTO;
import com.kovshov.Rest.Shop.facade.OrderFacade;
import com.kovshov.Rest.Shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService orderService;
    private final OrderFacade orderFacade;

    @Autowired
    public OrderController(OrderService orderService, OrderFacade orderFacade) {
        this.orderService = orderService;
        this.orderFacade = orderFacade;
    }

    @GetMapping("/all")
    public ResponseEntity<List<OrderDTO>> getAllOrders(){
        List<OrderDTO> orderDTOList = orderService.getAllOrders()
                .stream()
                .map(orderFacade::orderToOrderDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(orderDTOList, HttpStatus.OK);
    }
}
