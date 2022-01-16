package com.example.searchservice.controller;

import com.example.searchservice.entity.Product;
import com.example.searchservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PutMapping("/{productId}")
    public void update(@RequestBody Product product, @PathVariable String id){
        Product product1 = productRepository.findById(id).get();
        product1.setPrice(product.getPrice());
        product1.setInfo(product.getInfo());
        product1.setName(product.getName());
        productRepository.save(product1);
    }

    @PostMapping
    public void save(@RequestBody Product product){
        productRepository.save(product);
    }

    @PostMapping("/bulk")
    public void saveAll(@RequestBody List<Product> products){
        productRepository.saveAll(products);
    }
}
