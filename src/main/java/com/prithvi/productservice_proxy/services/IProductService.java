package com.prithvi.productservice_proxy.services;

import com.prithvi.productservice_proxy.dtos.ProductDto;

public interface IProductService {
    String getAllProducts();

    String getSingleProduct(Long productId);

    String addNewProduct(ProductDto productDto);

    String updateProduct(Long productId);

    String deleteProduct(Long productId);
}
