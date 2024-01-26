package com.prithvi.productservice_proxy.inheritanceexamples.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "mps_ta")
public class TA extends User {
    private double rating;
}
