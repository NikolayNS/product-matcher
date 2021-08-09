package com.dmitrenko.productmatcher.model.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class PriceRequest {

	@NotNull(message = "Параметр [priceRequest.cost] должен быть указан. ")
	private BigDecimal cost;

	private CurrencyEnum currency;

	@NotNull(message = "Параметр [priceRequest.cost] должен быть указан. ")
	private Boolean active;

	@NotNull(message = "Параметр [priceRequest.lat] должен быть указан. ")
	private Double lat;

	@NotNull(message = "Параметр [priceRequest.lon] должен быть указан. ")
	private Double lon;
}
