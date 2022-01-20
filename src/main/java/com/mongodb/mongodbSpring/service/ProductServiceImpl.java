package com.mongodb.mongodbSpring.service;

import com.mongodb.mongodbSpring.model.Product;
import com.mongodb.mongodbSpring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    @Qualifier("productRepository")
    private ProductRepository repository;

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Product> findByStockGreaterThan(Integer stock) {
        return repository.findByStockGreaterThan(stock);
    }

    @Override
    public void updateStock(Product product, Integer stock) {

    }
}
