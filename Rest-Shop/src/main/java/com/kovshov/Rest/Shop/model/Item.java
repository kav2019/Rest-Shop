package com.kovshov.Rest.Shop.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Entity
public class Item {
    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

    @Column(name = "price")
    private Float price;

    @Column(name = "quantiy")
    private Long quantiy;

    @Column(name = "discount")
    private Float discount;

    @Column(name = "review")
    private String review;

    @Column(name = "rating")
    private Float rating;

    @ElementCollection
    @CollectionTable(name="keyword", joinColumns = @JoinColumn(name = "item_id"))
    @Column(name = "word")
    private Set<String> keywords;

    @ElementCollection
    @CollectionTable(name="parametr", joinColumns = @JoinColumn(name = "item_id"))
    @MapKeyColumn(name = "key_parametr")
    @Column(name = "value_parametr")
    private Map<String, String> parametrs;

    @ManyToMany
    @JoinTable(
            name = "orders",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> userList;

    public Item() {
    }

    public Item(Long id, String title, String description, Company company, Float price, Long quantiy, Float discount,
                String review, Float rating, Set<String> keywords, Map<String, String> parametrs, List<User> userList) {
        this.id = id;
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
        this.userList = userList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
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



    public String getCompanyToString(){
        return company.getTitle();
    }

    public List<String> getOwnerToListString(){
        return userList.stream()
                .map(u -> u.getEmail())
                .collect(Collectors.toList());
    }
}
