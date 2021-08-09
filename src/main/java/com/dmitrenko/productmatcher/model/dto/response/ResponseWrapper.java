package com.dmitrenko.productmatcher.model.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ResponseWrapper<D> {
	private D data;
	private boolean success;
}
