package com.dmitrenko.productmatcher.service.domain.impl;

import com.dmitrenko.productmatcher.model.dto.request.ProductRequest;
import com.dmitrenko.productmatcher.model.dto.response.ProductResponse;
import com.dmitrenko.productmatcher.repository.ProductRepository;
import com.dmitrenko.productmatcher.service.domain.ProductDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductDomainServiceImpl implements ProductDomainService {

	private final ElasticsearchOperations elasticsearchOperations;
	private final ProductRepository productRepository;



	@Override
	public List<ProductResponse> addAll(List<ProductRequest> request) {

		return null;
	}
}
