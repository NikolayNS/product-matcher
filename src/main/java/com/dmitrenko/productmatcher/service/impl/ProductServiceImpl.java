package com.dmitrenko.productmatcher.service.impl;

import com.dmitrenko.productmatcher.model.dto.request.ProductRequest;
import com.dmitrenko.productmatcher.model.dto.response.ProductResponse;
import com.dmitrenko.productmatcher.service.ProductService;
import com.dmitrenko.productmatcher.service.domain.ProductDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductDomainService productDomainService;

	@Override
	public List<ProductResponse> addAll(List<ProductRequest> request) {

		return productDomainService.addAll(request);
	}
}
