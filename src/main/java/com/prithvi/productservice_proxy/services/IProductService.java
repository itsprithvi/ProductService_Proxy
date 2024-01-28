package com.prithvi.productservice_proxy.services;

import com.prithvi.productservice_proxy.clients.IClientProductDto;
import com.prithvi.productservice_proxy.clients.fakestore.dto.FakeStoreProductDto;
import com.prithvi.productservice_proxy.dtos.ProductDto;
import com.prithvi.productservice_proxy.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    Product getSingleProduct(Long productId);

    //String updateProduct(Long productId);

//    Product addNewProduct(Product product);

    Product addNewProduct(IClientProductDto productDto);

    Product updateProduct(Long productId, Product product);

    String deleteProduct(Long productId);
}
