package com.dmitrenko.productmatcher.controller;

import com.dmitrenko.productmatcher.model.dto.request.ProductListRequest;
import com.dmitrenko.productmatcher.model.dto.response.ProductListResponse;
import com.dmitrenko.productmatcher.model.dto.response.ResponseWrapper;
import com.dmitrenko.productmatcher.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
public class PrivateController {

	private static final String ADD_ALL = "/product/add-all";

	private final ProductService productService;

	@PostMapping(value = ADD_ALL, consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
	public ResponseWrapper<ProductListResponse> addAll(@RequestBody @Valid ProductListRequest request) {
		var response = productService.addAll(request.getList());
		return new ResponseWrapper<ProductListResponse>()
			.setData(new ProductListResponse()
				.setList(response))
			.setSuccess(!response.isEmpty());
	}
}
