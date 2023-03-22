package com.kovshov.Rest.Shop.model.role;

import com.kovshov.Rest.Shop.model.Item;
import com.kovshov.Rest.Shop.model.User;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Order {

    @Id
    private Long id;

    @Column(name = "datecreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;


    @ManyToOne
    @JoinColumn(name = "orderList")
    private User userId;

    @OneToMany(mappedBy = "order")
    private List<Item> itemId;
}
