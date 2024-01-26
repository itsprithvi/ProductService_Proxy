package com.prithvi.productservice_proxy.inheritanceexamples.singleclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "sc_instructor")
@DiscriminatorValue(value = "3")
public class Instructor extends User {
    private String company;
}
