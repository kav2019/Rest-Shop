package com.kovshov.Rest.Shop.model;

import jakarta.persistence.*;

@Entity
public class Parametr {

    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "item")
    private Item item;
}
