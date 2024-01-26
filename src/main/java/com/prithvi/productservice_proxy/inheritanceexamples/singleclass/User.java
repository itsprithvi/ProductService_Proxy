package com.prithvi.productservice_proxy.inheritanceexamples.singleclass;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "sc_user")
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.INTEGER)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
}
