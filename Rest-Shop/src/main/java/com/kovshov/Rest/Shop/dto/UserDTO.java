package com.kovshov.Rest.Shop.dto;

import java.util.List;

public class UserDTO {
    private String username;
    private String email;
    private Float balance;
    private List<String> companyList;
    private List<String> itemList;

    public UserDTO() {
    }

    public UserDTO(String username, String email, Float balance, List<String> companyList, List<String> itemList) {
        this.username = username;
        this.email = email;
        this.balance = balance;
        this.companyList = companyList;
        this.itemList = itemList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public List<String> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<String> companyList) {
        this.companyList = companyList;
    }

    public List<String> getItemList() {
        return itemList;
    }

    public void setItemList(List<String> itemList) {
        this.itemList = itemList;
    }
}
