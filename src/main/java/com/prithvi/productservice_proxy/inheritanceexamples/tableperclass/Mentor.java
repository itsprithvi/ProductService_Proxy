package com.prithvi.productservice_proxy.inheritanceexamples.tableperclass;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_mentor")
public class Mentor extends User{
    private int gradYear;

}
