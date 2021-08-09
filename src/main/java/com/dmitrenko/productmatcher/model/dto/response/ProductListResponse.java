package com.dmitrenko.productmatcher.model.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.LinkedList;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductListResponse {
	private List<ProductResponse> list = new LinkedList<>();
}
