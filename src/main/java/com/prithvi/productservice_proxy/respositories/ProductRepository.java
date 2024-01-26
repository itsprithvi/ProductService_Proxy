package com.prithvi.productservice_proxy.respositories;

import com.prithvi.productservice_proxy.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product save(Product product);
}
