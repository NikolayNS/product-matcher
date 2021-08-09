package com.dmitrenko.productmatcher.model.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;

import java.util.LinkedList;
import java.util.List;

@Data
@Accessors(chain = true)
@Validated
public class ProductRequest {

	private String name;
	private String description;

	@NotBlank(message = "Параметр [productRequest.barcode] должен быть указан. ")
	private String barcode;

	private String type;
	private String company;
	private String brandName;

	@NotEmpty(message = "Параметр [prices] должен быть указан и должен содержать элементы. ")
	private List<@Valid PriceRequest> prices = new LinkedList<>();
}
