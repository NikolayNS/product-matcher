package com.dmitrenko.productmatcher.model.dto.request;

public enum CurrencyEnum {
	RUB("RUB"),
	USD("USD"),
	EUR("EUR");

	private final String value;

	CurrencyEnum(String value) {
		this.value = value;
	}

	public static CurrencyEnum fromValue(String value) {
		for (CurrencyEnum b : CurrencyEnum.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	public String getValue() {
		return value;
	}
}
