package com.prithvi.productservice_proxy.controllers;


import com.prithvi.productservice_proxy.dtos.ProductDto;
import com.prithvi.productservice_proxy.models.Product;
import com.prithvi.productservice_proxy.services.IProductService;
import com.prithvi.productservice_proxy.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


// This controller will always answer products
@RestController
@RequestMapping("/products")
public class ProductController {


    IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId) {
        Product product = this.productService.getSingleProduct(productId);
        return product;
    }

    @PostMapping("")
    public String addNewProduct(@RequestBody ProductDto productDto) {
        return "Adding new Product " +productDto;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId) {
        return "Updating Product";
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        return "Deleting a product with id : " +productId;
    }

}
