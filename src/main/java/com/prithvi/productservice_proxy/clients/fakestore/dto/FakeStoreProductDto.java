package com.prithvi.productservice_proxy.clients.fakestore.dto;

import com.prithvi.productservice_proxy.clients.IClientProductDto;
import com.prithvi.productservice_proxy.dtos.RatingDto;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FakeStoreProductDto implements IClientProductDto {
    private Long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
    private RatingDto rating;
}
