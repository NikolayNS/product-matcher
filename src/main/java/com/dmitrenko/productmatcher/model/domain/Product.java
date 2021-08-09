package com.dmitrenko.productmatcher.model.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Accessors(chain = true)
@Document(indexName = "product")
public class Product {

	@Id
	@Field(type = FieldType.Keyword)
	private UUID id;

	@Field(type = FieldType.Keyword)
	private String name;

	@Field(type = FieldType.Text)
	private String description;

	@Field(type = FieldType.Keyword)
	private String barcode;

	@Field(type = FieldType.Keyword)
	private String type;

	@Field(type = FieldType.Keyword)
	private String company;

	@Field(type = FieldType.Keyword)
	private String brandName;

	@Field(type = FieldType.Nested)
	private List<Price> prices;

	@CreatedDate
	private LocalDateTime createdAt;
}
