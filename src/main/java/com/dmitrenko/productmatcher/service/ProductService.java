package com.dmitrenko.productmatcher.service;

import com.dmitrenko.productmatcher.model.dto.request.ProductRequest;
import com.dmitrenko.productmatcher.model.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {

	List<ProductResponse> addAll(List<ProductRequest> request);
}
