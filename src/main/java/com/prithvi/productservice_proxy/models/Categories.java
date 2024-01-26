package com.prithvi.productservice_proxy.models;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;


@Data
@Entity
public class Categories extends BaseModel{
    private String name;
    private String description;
    @OneToMany(mappedBy = "categories", cascade = CascadeType.MERGE)
    private List<Product> productList;
}

// mapped is available for one to one, one to many and many to many
