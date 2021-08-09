package com.dmitrenko.productmatcher.model.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductResponse {
	private String id;
	private String name;
	private String barcode;
}
