package com.prithvi.productservice_proxy.dtos;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductDto {
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
}
