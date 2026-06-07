package com.stlabs.QuickMart.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stlabs.QuickMart.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}