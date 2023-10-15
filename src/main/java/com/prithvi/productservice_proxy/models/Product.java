package com.prithvi.productservice_proxy.models;


import lombok.Data;

@Data
public class Product extends BaseModel{
    private String title;
    private double price;
    private String description;
    private Categories categories;
    private String imageUrl;
}
