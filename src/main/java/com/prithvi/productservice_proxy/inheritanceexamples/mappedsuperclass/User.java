package com.prithvi.productservice_proxy.inheritanceexamples.mappedsuperclass;

import jakarta.persistence.*;
import lombok.Data;

//@Entity(name = "mps_user")
@Data
@MappedSuperclass
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
}
