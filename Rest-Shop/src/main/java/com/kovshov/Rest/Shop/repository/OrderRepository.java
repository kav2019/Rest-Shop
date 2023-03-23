package com.kovshov.Rest.Shop.repository;

import com.kovshov.Rest.Shop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
