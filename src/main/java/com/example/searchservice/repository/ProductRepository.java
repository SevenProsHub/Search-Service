package com.example.searchservice.repository;
import com.example.searchservice.entity.Product;
import com.example.searchservice.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {
    List<Product> findByName(String name);
    List<Product> findByNameContaining(String name);
}
