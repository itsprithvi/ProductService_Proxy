package com.prithvi.productservice_proxy.inheritanceexamples.singleclass;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "sc_mentor")
@DiscriminatorValue(value = "2")
public class Mentor extends User {
    private int gradYear;

}
