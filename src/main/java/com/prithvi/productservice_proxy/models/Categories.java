package com.prithvi.productservice_proxy.models;



import lombok.Data;

import java.util.List;


@Data
public class Categories extends BaseModel{
    private String name;
    private String description;
    private List<Product> productList;
}
