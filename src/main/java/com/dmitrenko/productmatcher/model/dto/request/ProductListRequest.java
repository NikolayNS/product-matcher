package com.dmitrenko.productmatcher.model.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;

import java.util.LinkedList;
import java.util.List;

@Data
@Accessors(chain = true)
@Validated
public class ProductListRequest {

	@NotEmpty(message = "Параметр [list] должен быть указан и должен содержать элементы. ")
	private List<@Valid ProductRequest> list = new LinkedList<>();
}
