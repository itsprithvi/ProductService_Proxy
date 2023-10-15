package com.prithvi.productservice_proxy.dtos;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RatingDto {
    private double rate;
    private double count;
}
