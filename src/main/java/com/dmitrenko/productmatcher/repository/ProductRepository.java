package com.dmitrenko.productmatcher.repository;

import com.dmitrenko.productmatcher.model.domain.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.UUID;

public interface ProductRepository extends ElasticsearchRepository<Product, UUID> {
}
