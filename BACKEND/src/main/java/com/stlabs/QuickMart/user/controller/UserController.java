package com.stlabs.QuickMart.user.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "Get All Users";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return "Get User By Id: " + id;
    }

    @PostMapping
    public String createUser() {
        return "Create User";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id) {
        return "Update User";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "Delete User";
    }
}