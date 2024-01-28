package com.prithvi.productservice_proxy.services;

import com.prithvi.productservice_proxy.clients.IClientProductDto;
import com.prithvi.productservice_proxy.dtos.ProductDto;
import com.prithvi.productservice_proxy.models.Categories;
import com.prithvi.productservice_proxy.models.Product;
import com.prithvi.productservice_proxy.respositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SelfProductService implements IProductService{

    private final ProductRepository productRepository;

    public SelfProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public Product addNewProduct(IClientProductDto product) {
        this.productRepository.save((Product) product);
        return (Product) product;
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public String deleteProduct(Long productId) {
        return null;
    }

    private Product getProduct(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setTitle(productDto.getTitle());
        product.setPrice(productDto.getPrice());
        Categories categories = new Categories();
        categories.setName(productDto.getCategory());
        product.setCategory(categories);
        product.setImageUrl(productDto.getImage());
        product.setDescription(productDto.getDescription());
        return product;
    }
}
