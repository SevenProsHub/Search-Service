package com.example.searchservice.controller;

import com.example.searchservice.entity.Product;
import com.example.searchservice.service.ProductSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private ProductSearchService searchService;

    @GetMapping
    public List<Product> getSearched(@RequestParam(name = "query") String query){
        return  searchService.serchByquery(query);
    }
}
