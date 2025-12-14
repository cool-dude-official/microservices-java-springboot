package com.example.Inventory.Service.Port._1.service;

import com.example.Inventory.Service.Port._1.model.Product;
import com.example.Inventory.Service.Port._1.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public Product save(Product product) {
        return repo.save(product);   // DB me save karega
    }

    @Override
    public List<Product> getAll() {
        return repo.findAll();       // DB se sab products fetch karega
    }
}