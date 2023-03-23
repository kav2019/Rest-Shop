package com.kovshov.Rest.Shop.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ItemDTO {
    private String title;
    private String description;
    private String company;
    private Float price;
    private Long quantiy;
    private Float discount;
    private String review;
    private Float rating;
    private Set<String> keywords;
    private Map<String, String> parametrs;

    private List<String> owner;

    public ItemDTO() {
    }

    public ItemDTO(String title, String description, String company, Float price, Long quantiy, Float discount,
                   String review, Float rating, Set<String> keywords, Map<String, String> parametrs,
                   List<String> userList) {
        this.title = title;
        this.description = description;
        this.company = company;
        this.price = price;
        this.quantiy = quantiy;
        this.discount = discount;
        this.review = review;
        this.rating = rating;
        this.keywords = keywords;
        this.parametrs = parametrs;
        this.owner = userList;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(Long quantiy) {
        this.quantiy = quantiy;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Set<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(Set<String> keywords) {
        this.keywords = keywords;
    }

    public Map<String, String> getParametrs() {
        return parametrs;
    }

    public void setParametrs(Map<String, String> parametrs) {
        this.parametrs = parametrs;
    }

    public List<String> getOwner() {
        return owner;
    }

    public void setOwner(List<String> owner) {
        this.owner = owner;
    }
}
