package com.prithvi.productservice_proxy.inheritanceexamples.tableperclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_instructor")
public class Instructor extends User {
    private String company;
}
