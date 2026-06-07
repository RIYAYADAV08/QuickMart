package com.stlabs.QuickMart.cart.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {

    @GetMapping
    public String getCart() {
        return "Get Cart";
    }

    @PostMapping
    public String addItemToCart() {
        return "Add Item To Cart";
    }

    @PutMapping("/{id}")
    public String updateCartItem(@PathVariable Long id) {
        return "Update Cart Item: " + id;
    }

    @DeleteMapping("/{id}")
    public String removeItemFromCart(@PathVariable Long id) {
        return "Remove Item From Cart: " + id;
    }

    @DeleteMapping("/clear")
    public String clearCart() {
        return "Clear Cart";
    }
}