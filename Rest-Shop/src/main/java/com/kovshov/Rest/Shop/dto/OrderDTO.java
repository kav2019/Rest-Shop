package com.kovshov.Rest.Shop.dto;

import java.util.Date;
import java.util.List;

public class OrderDTO {
    private String user;
    private List<String> items;
    private Date dateCreate;

    public OrderDTO() {
    }

    public OrderDTO(String user, List<String> items, Date dateCreate) {
        this.user = user;
        this.items = items;
        this.dateCreate = dateCreate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}
