package com.kovshov.Rest.Shop.model;

import com.kovshov.Rest.Shop.model.role.Order;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Entity
public class Item {
    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

    @Column(name = "price")
    private Float price;

    @Column(name = "quantiy")
    private Long quantiy;

    @Column(name = "discount")
    private Float discount;

    @Column(name = "review")
    private String review;

    @Column(name = "rating")
    private Float rating;

    @ElementCollection
    @CollectionTable(name="keyword", joinColumns = @JoinColumn(name = "item_id"))
    @Column(name = "word")
    private Set<String> keywords;

    @ElementCollection
    @CollectionTable(name="parametr", joinColumns = @JoinColumn(name = "item_id"))
    @MapKeyColumn(name = "key_parametr")
    @Column(name = "value_parametr")
    private Map<String, String> parametrs;

//    @ManyToOne
//    @JoinColumn(name = "itemId")
//    private Order order;

}
