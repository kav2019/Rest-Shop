package com.kovshov.Rest.Shop.dto;

import com.kovshov.Rest.Shop.model.Item;
import com.kovshov.Rest.Shop.model.User;

import java.util.List;

public class CompanyDTO {

    private String title;
    private String description;
    private String logo;

    private String owner;

    private List<String> items;

    public CompanyDTO() {
    }

    public CompanyDTO(String title, String description, String logo, String owner, List<String> items) {
        this.title = title;
        this.description = description;
        this.logo = logo;
        this.owner = owner;
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
