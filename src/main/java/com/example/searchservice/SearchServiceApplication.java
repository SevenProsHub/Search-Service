package com.example.searchservice;

//import com.example.searchservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringBootApplication
public class SearchServiceApplication {
//
//	private static final String COMMA_DELIMITER = ",";
//
//	@Autowired
//	private ElasticsearchOperations esOps;
//
//	@PreDestroy
//	public void deleteIndex() {
//		esOps.indexOps(Product.class).delete();
//	}

	public static void main(String[] args) {
		SpringApplication.run(SearchServiceApplication.class, args);
	}

}
