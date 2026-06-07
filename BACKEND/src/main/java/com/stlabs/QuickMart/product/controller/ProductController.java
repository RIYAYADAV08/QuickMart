package com.stlabs.QuickMart.product.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @GetMapping
    public String getAllProduct() {
        return "Get All Products";
    }

    @GetMapping("/{id}")
    public String getSingleProduct(@PathVariable Long id) {
        return "Get Product By Id: " + id;
    }

    @PostMapping
    public String createProduct() {
        return "Create Product";
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable Long id) {
        return "Update Product";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return "Delete Product";
    }
}