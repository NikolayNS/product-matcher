package com.dmitrenko.productmatcher.model.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class Price {

	@Field(type = FieldType.Double)
	private BigDecimal cost;

	@Field(type = FieldType.Text)
	private String currency;

	@Field(type = FieldType.Boolean)
	private Boolean active;

	@GeoPointField
	private GeoPoint location;
}
