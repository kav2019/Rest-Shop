package com.kovshov.Rest.Shop.model;

import com.kovshov.Rest.Shop.model.role.Order;
import com.kovshov.Rest.Shop.model.role.Role;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "balance")
    private Float balance;

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @Column(name = "status")
    private boolean status;

    @OneToMany(mappedBy = "owner")
    private List<Company> companyList;

    @OneToMany(mappedBy = "userId")
    private List<Order> orderList;


}
