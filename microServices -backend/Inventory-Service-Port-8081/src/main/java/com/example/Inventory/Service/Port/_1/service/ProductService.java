package com.example.Inventory.Service.Port._1.service;

import com.example.Inventory.Service.Port._1.model.Product;
import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> getAll();
}