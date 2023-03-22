package com.kovshov.Rest.Shop.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "logo")
    private String logo;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;

    @OneToMany(mappedBy = "company")
    private List<Item> items;
}
