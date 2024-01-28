package com.prithvi.productservice_proxy.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private String title;
    private double price;
    private String description;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Categories category;
    private String imageUrl;
}
