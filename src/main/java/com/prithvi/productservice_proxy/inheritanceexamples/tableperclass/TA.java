package com.prithvi.productservice_proxy.inheritanceexamples.tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_ta")
public class TA extends User {
    private double rating;
}
