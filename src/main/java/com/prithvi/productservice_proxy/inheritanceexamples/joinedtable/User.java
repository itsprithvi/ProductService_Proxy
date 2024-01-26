package com.prithvi.productservice_proxy.inheritanceexamples.joinedtable;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "jt_user")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
}
