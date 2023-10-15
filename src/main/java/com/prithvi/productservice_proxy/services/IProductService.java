package com.prithvi.productservice_proxy.services;

import com.prithvi.productservice_proxy.dtos.ProductDto;
import com.prithvi.productservice_proxy.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    Product getSingleProduct(Long productId);

    Product addNewProduct(ProductDto productDto);

    String updateProduct(Long productId);

    String deleteProduct(Long productId);
}
