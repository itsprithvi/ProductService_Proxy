package com.prithvi.productservice_proxy.controllers;


import com.prithvi.productservice_proxy.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;


// This controller will always answer products
@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public String getSingleProduct(@PathVariable("id") int productId) {
        return "This is the single product " + productId;
    }

    @PostMapping("")
    public String addNewProduct(@RequestBody ProductDto productDto) {
        return "Adding new Product " +productDto;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId) {
        return "Updating Product";
    }

    @DeleteMapping("/{productId")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        return "Deleting a product with id : " +productId;
    }

}
