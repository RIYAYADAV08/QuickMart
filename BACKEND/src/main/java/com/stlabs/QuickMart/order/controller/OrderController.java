package com.stlabs.QuickMart.order.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @GetMapping
    public String getAllOrders() {
        return "Get All Orders";
    }

    @GetMapping("/{id}")
    public String getOrderById(@PathVariable Long id) {
        return "Get Order By Id: " + id;
    }

    @PostMapping
    public String placeOrder() {
        return "Place Order";
    }

    @PutMapping("/{id}/status")
    public String updateOrderStatus(@PathVariable Long id) {
        return "Update Order Status: " + id;
    }


    @DeleteMapping("/{id}")
    public String cancelOrder(@PathVariable Long id) {
        return "Cancel Order: " + id;
    }
    
}