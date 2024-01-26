package com.prithvi.productservice_proxy.inheritanceexamples.mappedsuperclass;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "mps_mentor")
public class Mentor extends User {
    private int gradYear;

}
