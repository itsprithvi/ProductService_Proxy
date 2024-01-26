package com.prithvi.productservice_proxy.inheritanceexamples.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "mps_instructor")
public class Instructor extends User {
    private String company;
}
