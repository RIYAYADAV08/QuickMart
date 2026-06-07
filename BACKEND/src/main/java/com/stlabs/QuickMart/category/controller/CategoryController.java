package com.stlabs.QuickMart.category.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    @GetMapping
    public String getAllCategory() {
        return "Get All Categories";
    }

    @GetMapping("/{id}")
    public String getSingleCategory(@PathVariable Long id) {
        return "Get Category By Id: " + id;
    }

    @PostMapping
    public String createCategory() {
        return "Create Category";
    }

    @PutMapping("/{id}")
    public String updateCategory(@PathVariable Long id) {
        return "Update Category";
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Long id) {
        return "Delete Category";
    }
}