package com.example.gc_coffee.service;

import com.example.gc_coffee.model.Category;
import com.example.gc_coffee.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductsByCategory(Category category);

    List<Product> getAllProducts();

    Product createProduct(String productName, Category category, long price);

    Product createProduct(String productName, Category category, long price, String description);
}
