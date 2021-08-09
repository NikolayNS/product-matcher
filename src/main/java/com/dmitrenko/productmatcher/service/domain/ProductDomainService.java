package com.dmitrenko.productmatcher.service.domain;

import com.dmitrenko.productmatcher.model.dto.request.ProductRequest;
import com.dmitrenko.productmatcher.model.dto.response.ProductResponse;

import java.util.List;

public interface ProductDomainService {

	List<ProductResponse> addAll(List<ProductRequest> request);
}
