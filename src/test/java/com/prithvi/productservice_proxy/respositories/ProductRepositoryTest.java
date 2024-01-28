package com.prithvi.productservice_proxy.respositories;

import com.prithvi.productservice_proxy.models.Categories;
import com.prithvi.productservice_proxy.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    @Transactional
    void saveProductAndCategory() {
        Categories categories = new Categories();
        categories.setName("Electronics");
        categories.setDescription("Electronics");
        categoryRepository.save(categories);

        Product product = new Product();
        product.setTitle("Laptop");
        product.setDescription("Laptop");
        product.setCategory(categories);
        productRepository.save(product);
    }
}