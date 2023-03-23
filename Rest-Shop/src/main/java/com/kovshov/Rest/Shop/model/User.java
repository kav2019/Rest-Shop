package com.kovshov.Rest.Shop.model;

import com.kovshov.Rest.Shop.model.role.Role;
import jakarta.persistence.*;

import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "users")
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

//    @Column(name = "role")
//    @Enumerated(value = EnumType.STRING)
//    private Role role;

    @Column(name = "status")
    private boolean status;

    @OneToMany(mappedBy = "owner")
    private List<Company> companyList;

//    @OneToMany(mappedBy = "user")
//    private List<Order> orderList;

    @ManyToMany
    @JoinTable(
            name = "orders",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private List<Item> itemList;

    public User() {
    }

    public User(Long id, String username, String password, String email, Float balance, boolean status, List<Company> companyList, List<Item> itemList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.balance = balance;
        this.status = status;
        this.companyList = companyList;
        this.itemList = itemList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<String> getAllCompanyAsString(){
        return companyList.stream()
                .map(c -> c.getTitle())
                .collect(Collectors.toList());
    }

    public List<String> getAllItemsAsString(){
        return itemList.stream()
                .map(i -> i.getTitle())
                .collect(Collectors.toList());
    }
}
