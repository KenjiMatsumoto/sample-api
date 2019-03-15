package com.sample.sampleapi.controller;

import java.util.List;

import com.sample.sampleapi.entity.Currency;

import lombok.*;

@Getter
@Builder
public class CurrencyResponse {

	private List<Currency> currencies;
}
