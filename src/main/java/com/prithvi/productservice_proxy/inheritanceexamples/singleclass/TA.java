package com.prithvi.productservice_proxy.inheritanceexamples.singleclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "sc_ta")
@DiscriminatorValue(value = "1")
public class TA extends User {
    private double rating;
}
