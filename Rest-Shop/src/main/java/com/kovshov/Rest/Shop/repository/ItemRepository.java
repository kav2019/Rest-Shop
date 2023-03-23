package com.kovshov.Rest.Shop.repository;

import com.kovshov.Rest.Shop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
