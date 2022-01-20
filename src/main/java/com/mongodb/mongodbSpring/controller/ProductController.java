package com.mongodb.mongodbSpring.controller;

import com.mongodb.mongodbSpring.model.Product;
import com.mongodb.mongodbSpring.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductServiceImpl service;

    @PostMapping
    public Product createUser(@RequestBody Product product){
        return service.createProduct(product);
    }
    @GetMapping
    public List<Product> findAll(){
        return service.findAll();
    }
    @GetMapping("/product")
    public Product findByName(@RequestParam String name){
        return service.findByName(name);
    }
    @GetMapping("/product/stock")
    public List<Product> findByGreaterStock(@RequestParam Integer stock){
        return service.findByStockGreaterThan(stock);
    }
}
