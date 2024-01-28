package com.prithvi.productservice_proxy.models;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class Categories extends BaseModel{
    private String name;
    private String description;
    @OneToMany(mappedBy = "category", cascade = CascadeType.MERGE)
    private List<Product> productList;
}

// mapped is available for one to one, one to many and many to many
