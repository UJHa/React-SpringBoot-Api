package com.example.gc_coffee.controller;

import com.example.gc_coffee.model.Category;

public record CreateProductRequest(String productName, Category category, long price, String description) {
}
