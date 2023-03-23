package com.kovshov.Rest.Shop.dto;

import java.util.Date;
import java.util.List;

public class OrderDTO {
    private String user;
    private String item;
    private Date dateCreate;

    public OrderDTO() {
    }

    public OrderDTO(String user, String item, Date dateCreate) {
        this.user = user;
        this.item = item;
        this.dateCreate = dateCreate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}
