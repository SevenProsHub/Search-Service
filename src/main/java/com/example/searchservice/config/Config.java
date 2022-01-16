package com.example.searchservice.config;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;
import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
public class Config extends AbstractElasticsearchConfiguration {

    @Override
    @Bean
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration clientConfiguration =
                ClientConfiguration
                        .builder()
                        .connectedTo("localhost:9200")
                        .build();
        return RestClients.create(clientConfiguration).rest();
    }

//    @Bean
//    public boolean createTestIndex(RestHighLevelClient restHighLevelClient) throws Exception {
//        try {
//            DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest("productIndex");
//            restHighLevelClient.indices().delete(deleteIndexRequest, RequestOptions.DEFAULT); // 1
//        } catch (Exception ignored) {
//        }
//
//        CreateIndexRequest createIndexRequest = new CreateIndexRequest("productIndex");
//        createIndexRequest.settings(
//                Settings.builder().put("index.number_of_shards", 1)
//                        .put("index.number_of_replicas", 0));
//        restHighLevelClient.indices().create(createIndexRequest, RequestOptions.DEFAULT); // 2
//
//        return true;
//    }
}
